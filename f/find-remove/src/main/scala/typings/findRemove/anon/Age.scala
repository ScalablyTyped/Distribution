package typings.findRemove.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Age extends js.Object {
  
  /** can be any float number. findRemoveSync then compares it with the file stats and deletes those with modification times older than age.seconds */
  var age: js.UndefOr[Seconds] = js.native
  
  /** can be a string or an array of directories you want to delete within dir. */
  var dir: js.UndefOr[String | js.Array[String]] = js.native
  
  /** this too, can be a string or an array of file extentions you want to delete within dir */
  var extensions: js.UndefOr[String | js.Array[String]] = js.native
  
  /** can be a string or an array of files you want to delete within dir */
  var files: js.UndefOr[String | js.Array[String]] = js.native
  
  /** useful to exclude some files. again, can be a string or an array of file names you do NOT want to delete within dir */
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  
  /** can be any integer number. Will limit the number of files to be deleted at single operation to be limit */
  var limit: js.UndefOr[Double] = js.native
  
  /** advanced: limits filtering to a certain level. useful for performance. recommended for crawling huge directory trees */
  var maxLevel: js.UndefOr[Double] = js.native
  
  /** can be any string. Will delete any files that start with prefix */
  var prefix: js.UndefOr[String] = js.native
  
  /** advanced: set to true for a test run, meaning it does not delete anything but returns a JSON of files/directories it would have deleted. useful for testing. */
  var test: js.UndefOr[Boolean] = js.native
}
object Age {
  
  @scala.inline
  def apply(): Age = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Age]
  }
  
  @scala.inline
  implicit class AgeOps[Self <: Age] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAge(value: Seconds): Self = this.set("age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    
    @scala.inline
    def setDirVarargs(value: String*): Self = this.set("dir", js.Array(value :_*))
    
    @scala.inline
    def setDir(value: String | js.Array[String]): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: String | js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: String | js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMaxLevel(value: Double): Self = this.set("maxLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLevel: Self = this.set("maxLevel", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}

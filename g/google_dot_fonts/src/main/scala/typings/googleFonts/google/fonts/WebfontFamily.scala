package typings.googleFonts.google.fonts

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebfontFamily extends js.Object {
  var category: js.UndefOr[String] = js.native
  var family: String = js.native
  var files: StringDictionary[String] = js.native
  var kind: String = js.native
  var lastModified: String = js.native
  var subsets: js.Array[String] = js.native
  var variants: js.Array[String] = js.native
  var version: String = js.native
}

object WebfontFamily {
  @scala.inline
  def apply(
    family: String,
    files: StringDictionary[String],
    kind: String,
    lastModified: String,
    subsets: js.Array[String],
    variants: js.Array[String],
    version: String
  ): WebfontFamily = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], subsets = subsets.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebfontFamily]
  }
  @scala.inline
  implicit class WebfontFamilyOps[Self <: WebfontFamily] (val x: Self) extends AnyVal {
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiles(value: StringDictionary[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubsetsVarargs(value: String*): Self = this.set("subsets", js.Array(value :_*))
    @scala.inline
    def setSubsets(value: js.Array[String]): Self = this.set("subsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariantsVarargs(value: String*): Self = this.set("variants", js.Array(value :_*))
    @scala.inline
    def setVariants(value: js.Array[String]): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
  }
  
}


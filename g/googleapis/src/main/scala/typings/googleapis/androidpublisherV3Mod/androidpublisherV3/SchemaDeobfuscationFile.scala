package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a deobfuscation file.
  */
@js.native
trait SchemaDeobfuscationFile extends js.Object {
  
  /**
    * The type of the deobfuscation file.
    */
  var symbolType: js.UndefOr[String] = js.native
}
object SchemaDeobfuscationFile {
  
  @scala.inline
  def apply(): SchemaDeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFile]
  }
  
  @scala.inline
  implicit class SchemaDeobfuscationFileOps[Self <: SchemaDeobfuscationFile] (val x: Self) extends AnyVal {
    
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
    def setSymbolType(value: String): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
  }
}

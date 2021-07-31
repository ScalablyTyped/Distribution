package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a deobfuscation file.
  */
trait SchemaDeobfuscationFile extends StObject {
  
  /**
    * The type of the deobfuscation file.
    */
  var symbolType: js.UndefOr[String] = js.undefined
}
object SchemaDeobfuscationFile {
  
  @scala.inline
  def apply(): SchemaDeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFile]
  }
  
  @scala.inline
  implicit class SchemaDeobfuscationFileMutableBuilder[Self <: SchemaDeobfuscationFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
  }
}

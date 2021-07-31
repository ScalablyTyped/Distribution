package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TmpDirOptions extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
}
object TmpDirOptions {
  
  @scala.inline
  def apply(): TmpDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TmpDirOptions]
  }
  
  @scala.inline
  implicit class TmpDirOptionsMutableBuilder[Self <: TmpDirOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}

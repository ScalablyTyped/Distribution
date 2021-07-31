package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDefaultSpecifier
  extends StObject
     with BaseModuleSpecifier
     with ModuleSpecifier {
  
  @JSName("type")
  var type_ImportDefaultSpecifier: typings.estree.estreeStrings.ImportDefaultSpecifier
}
object ImportDefaultSpecifier {
  
  @scala.inline
  def apply(local: Identifier): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
  
  @scala.inline
  implicit class ImportDefaultSpecifierMutableBuilder[Self <: ImportDefaultSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

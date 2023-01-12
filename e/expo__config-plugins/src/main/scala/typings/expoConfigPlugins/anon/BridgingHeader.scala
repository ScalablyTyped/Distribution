package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgingHeader extends StObject {
  
  var bridgingHeader: String
  
  var project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
}
object BridgingHeader {
  
  inline def apply(
    bridgingHeader: String,
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): BridgingHeader = {
    val __obj = js.Dynamic.literal(bridgingHeader = bridgingHeader.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgingHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BridgingHeader] (val x: Self) extends AnyVal {
    
    inline def setBridgingHeader(value: String): Self = StObject.set(x, "bridgingHeader", value.asInstanceOf[js.Any])
    
    inline def setProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
    ): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}

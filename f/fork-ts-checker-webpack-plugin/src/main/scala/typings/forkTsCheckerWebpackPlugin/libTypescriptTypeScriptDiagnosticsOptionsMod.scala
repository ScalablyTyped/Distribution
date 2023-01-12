package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTypeScriptDiagnosticsOptionsMod {
  
  trait TypeScriptDiagnosticsOptions extends StObject {
    
    var declaration: Boolean
    
    var global: Boolean
    
    var semantic: Boolean
    
    var syntactic: Boolean
  }
  object TypeScriptDiagnosticsOptions {
    
    inline def apply(declaration: Boolean, global: Boolean, semantic: Boolean, syntactic: Boolean): TypeScriptDiagnosticsOptions = {
      val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any], syntactic = syntactic.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptDiagnosticsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeScriptDiagnosticsOptions] (val x: Self) extends AnyVal {
      
      inline def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
      
      inline def setSyntactic(value: Boolean): Self = StObject.set(x, "syntactic", value.asInstanceOf[js.Any])
    }
  }
}

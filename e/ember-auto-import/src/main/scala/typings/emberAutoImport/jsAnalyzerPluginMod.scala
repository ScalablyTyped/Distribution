package typings.emberAutoImport

import typings.babelTypes.mod.CallExpression_
import typings.emberAutoImport.anon.Imports
import typings.emberAutoImport.anon.TypeofBabel
import typings.emberAutoImport.anon.Visitor
import typings.emberAutoImport.jsAnalyzerSyntaxMod.ImportSyntax
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAnalyzerPluginMod {
  
  inline def apply(babel: TypeofBabel): Visitor = ^.asInstanceOf[js.Dynamic].apply(babel.asInstanceOf[js.Any]).asInstanceOf[Visitor]
  
  @JSImport("ember-auto-import/js/analyzer-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait State extends StObject {
    
    var handled: WeakSet[CallExpression_]
    
    var imports: js.Array[ImportSyntax]
    
    var opts: Imports
  }
  object State {
    
    inline def apply(handled: WeakSet[CallExpression_], imports: js.Array[ImportSyntax], opts: Imports): State = {
      val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setHandled(value: WeakSet[CallExpression_]): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setImports(value: js.Array[ImportSyntax]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsVarargs(value: ImportSyntax*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setOpts(value: Imports): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
}

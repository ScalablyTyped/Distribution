package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndentLevel extends StObject {
  
  var indentLevel: js.UndefOr[Double] = js.undefined
  
  var newline: js.UndefOr[String] = js.undefined
}
object IndentLevel {
  
  inline def apply(): IndentLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndentLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndentLevel] (val x: Self) extends AnyVal {
    
    inline def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    inline def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
  }
}

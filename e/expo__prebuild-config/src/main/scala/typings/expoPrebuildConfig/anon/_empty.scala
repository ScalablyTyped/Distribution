package typings.expoPrebuildConfig.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty[H /* <: Record[String, Any] */] extends StObject {
  
  @JSName("$")
  var $: H
}
object _empty {
  
  inline def apply[H /* <: Record[String, Any] */]($: H): _empty[H] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty[H]]
  }
  
  extension [Self <: _empty[?], H /* <: Record[String, Any] */](x: Self & _empty[H]) {
    
    inline def set$(value: H): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}

package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Narrow extends StObject {
  
  var long: js.Array[String] = js.native
  
  var narrow: js.Array[String] = js.native
  
  var short: js.Array[String] = js.native
}
object Narrow {
  
  @scala.inline
  def apply(long: js.Array[String], narrow: js.Array[String], short: js.Array[String]): Narrow = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Narrow]
  }
  
  @scala.inline
  implicit class NarrowMutableBuilder[Self <: Narrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: js.Array[String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongVarargs(value: String*): Self = StObject.set(x, "long", js.Array(value :_*))
    
    @scala.inline
    def setNarrow(value: js.Array[String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrowVarargs(value: String*): Self = StObject.set(x, "narrow", js.Array(value :_*))
    
    @scala.inline
    def setShort(value: js.Array[String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortVarargs(value: String*): Self = StObject.set(x, "short", js.Array(value :_*))
  }
}

package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'narrow' | 'short' | 'long', string | undefined> */
@js.native
trait Recordnarrowshortlongstri extends StObject {
  
  var long: js.UndefOr[String] = js.native
  
  var narrow: js.UndefOr[String] = js.native
  
  var short: js.UndefOr[String] = js.native
}
object Recordnarrowshortlongstri {
  
  @scala.inline
  def apply(): Recordnarrowshortlongstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recordnarrowshortlongstri]
  }
  
  @scala.inline
  implicit class RecordnarrowshortlongstriMutableBuilder[Self <: Recordnarrowshortlongstri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    @scala.inline
    def setNarrow(value: String): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
  }
}

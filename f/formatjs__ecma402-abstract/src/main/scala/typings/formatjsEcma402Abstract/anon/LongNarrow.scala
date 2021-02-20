package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.displaynamesMod.LanguageTag
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongNarrow extends StObject {
  
  var long: Record[LanguageTag, String] = js.native
  
  var narrow: Record[LanguageTag, String] = js.native
  
  var short: Record[LanguageTag, String] = js.native
}
object LongNarrow {
  
  @scala.inline
  def apply(
    long: Record[LanguageTag, String],
    narrow: Record[LanguageTag, String],
    short: Record[LanguageTag, String]
  ): LongNarrow = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongNarrow]
  }
  
  @scala.inline
  implicit class LongNarrowMutableBuilder[Self <: LongNarrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: Record[LanguageTag, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: Record[LanguageTag, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Record[LanguageTag, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}

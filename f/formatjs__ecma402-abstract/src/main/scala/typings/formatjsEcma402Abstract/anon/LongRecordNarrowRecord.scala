package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.ScriptCode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRecordNarrowRecord extends StObject {
  
  var long: Record[ScriptCode, String]
  
  var narrow: Record[ScriptCode, String]
  
  var short: Record[ScriptCode, String]
}
object LongRecordNarrowRecord {
  
  @scala.inline
  def apply(
    long: Record[ScriptCode, String],
    narrow: Record[ScriptCode, String],
    short: Record[ScriptCode, String]
  ): LongRecordNarrowRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRecordNarrowRecord]
  }
  
  @scala.inline
  implicit class LongRecordNarrowRecordMutableBuilder[Self <: LongRecordNarrowRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: Record[ScriptCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: Record[ScriptCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Record[ScriptCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}

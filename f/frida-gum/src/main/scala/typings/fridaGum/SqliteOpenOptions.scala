package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqliteOpenOptions extends StObject {
  
  var flags: js.UndefOr[js.Array[SqliteOpenFlag]] = js.undefined
}
object SqliteOpenOptions {
  
  @scala.inline
  def apply(): SqliteOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqliteOpenOptions]
  }
  
  @scala.inline
  implicit class SqliteOpenOptionsMutableBuilder[Self <: SqliteOpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: js.Array[SqliteOpenFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setFlagsVarargs(value: SqliteOpenFlag*): Self = StObject.set(x, "flags", js.Array(value :_*))
  }
}

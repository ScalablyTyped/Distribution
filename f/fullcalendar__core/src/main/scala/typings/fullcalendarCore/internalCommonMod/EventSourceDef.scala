package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceDef[Meta] extends StObject {
  
  def fetch(
    arg: Context[Meta],
    successCallback: js.Function1[/* res */ EventSourceFetcherRes, Unit],
    errorCallback: js.Function1[/* error */ js.Error, Unit]
  ): Unit
  @JSName("fetch")
  var fetch_Original: EventSourceFetcher[Meta]
  
  var ignoreRange: js.UndefOr[Boolean] = js.undefined
  
  def parseMeta(refined: EventSourceRefined): Meta | Null
}
object EventSourceDef {
  
  inline def apply[Meta](
    fetch: (/* arg */ Context[Meta], /* successCallback */ js.Function1[/* res */ EventSourceFetcherRes, Unit], /* errorCallback */ js.Function1[/* error */ js.Error, Unit]) => Unit,
    parseMeta: EventSourceRefined => Meta | Null
  ): EventSourceDef[Meta] = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction3(fetch), parseMeta = js.Any.fromFunction1(parseMeta))
    __obj.asInstanceOf[EventSourceDef[Meta]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSourceDef[?], Meta] (val x: Self & EventSourceDef[Meta]) extends AnyVal {
    
    inline def setFetch(
      value: (/* arg */ Context[Meta], /* successCallback */ js.Function1[/* res */ EventSourceFetcherRes, Unit], /* errorCallback */ js.Function1[/* error */ js.Error, Unit]) => Unit
    ): Self = StObject.set(x, "fetch", js.Any.fromFunction3(value))
    
    inline def setIgnoreRange(value: Boolean): Self = StObject.set(x, "ignoreRange", value.asInstanceOf[js.Any])
    
    inline def setIgnoreRangeUndefined: Self = StObject.set(x, "ignoreRange", js.undefined)
    
    inline def setParseMeta(value: EventSourceRefined => Meta | Null): Self = StObject.set(x, "parseMeta", js.Any.fromFunction1(value))
  }
}

package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  def abort(): Unit
  
  def send(callback: js.Function1[/* response */ QueryResponse, Unit]): Unit
  
  def setQuery(queryString: String): Unit
  
  def setRefreshInterval(intervalSeconds: Double): Unit
  
  def setTimeout(timeoutSeconds: Double): Unit
}
object Query {
  
  @scala.inline
  def apply(
    abort: () => Unit,
    send: js.Function1[/* response */ QueryResponse, Unit] => Unit,
    setQuery: String => Unit,
    setRefreshInterval: Double => Unit,
    setTimeout: Double => Unit
  ): Query = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), send = js.Any.fromFunction1(send), setQuery = js.Any.fromFunction1(setQuery), setRefreshInterval = js.Any.fromFunction1(setRefreshInterval), setTimeout = js.Any.fromFunction1(setTimeout))
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: js.Function1[/* response */ QueryResponse, Unit] => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetQuery(value: String => Unit): Self = StObject.set(x, "setQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRefreshInterval(value: Double => Unit): Self = StObject.set(x, "setRefreshInterval", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTimeout(value: Double => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
  }
}

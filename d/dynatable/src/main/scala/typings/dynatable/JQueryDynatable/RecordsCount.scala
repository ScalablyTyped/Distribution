package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordsCount extends StObject {
  
  /** Insert the record count inside the page */
  def attach(): Unit
  
  /**
    * Generate the html markup for the record count
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery
  
  /** Create and init the records count */
  def init(): Unit
  
  /**
    * Check if recordCount feature is enabled
    *
    * @return A boolean if recordCount feature is enabled
    */
  def initOnLoad(): Boolean
}
object RecordsCount {
  
  @scala.inline
  def apply(attach: () => Unit, create: () => JQuery, init: () => Unit, initOnLoad: () => Boolean): RecordsCount = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad))
    __obj.asInstanceOf[RecordsCount]
  }
  
  @scala.inline
  implicit class RecordsCountMutableBuilder[Self <: RecordsCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttach(value: () => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreate(value: () => JQuery): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitOnLoad(value: () => Boolean): Self = StObject.set(x, "initOnLoad", js.Any.fromFunction0(value))
  }
}

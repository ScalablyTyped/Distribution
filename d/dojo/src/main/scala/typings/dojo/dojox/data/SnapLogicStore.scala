package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/SnapLogicStore.html
  *
  *
  * @param args An object that contains properties for initializing the new data store object. Thefollowing properties are understood:url:  A URL to the SnapLogic pipeline's output routed through PipeToHttp. Typically, this  will look like http://<server-host>:<port>/pipe/<pipeline-url>/<pipeline-output-view>.parameters:  An object whose properties define parameters to the pipeline. The values of these  properties will be sent to the pipeline as parameters when it run.
  */
@JSGlobal("dojox.data.SnapLogicStore")
@js.native
class SnapLogicStore protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    *
    */
  var Parts: js.Object = js.native
  /**
    *
    */
  var url: String = js.native
  /**
    * See dojo/data/api/Read.close()
    *
    * @param request
    */
  def close(request: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Read.containsValue()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.close()
    *
    * @param request See dojo/data/api/Read.close() for generic interface.In addition to the standard Read API fetch support, this store supports an optimization forfor retrieving the total count of records in the Pipeline without retrieving the data. Touse this optimization, simply provide an onBegin handler without an onItem or onComplete handler.
    */
  def fetch(request: js.Object): js.Object = js.native
  /**
    * See dojo/data/api/Read.getAttributes()
    *
    * @param item
    */
  def getAttributes(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getFeatures()
    *
    */
  def getFeatures(): js.Object = js.native
  /**
    * See dojo/data/api/Read.getLabel()
    *
    * @param item
    */
  def getLabel(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabelAttributes()
    *
    * @param item
    */
  def getLabelAttributes(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    * @param defaultValue
    */
  def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    */
  def getValues(item: js.Any, attribute: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.hasAttributes()
    *
    * @param item
    * @param attribute
    */
  def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItem()
    *
    * @param item
    */
  def isItem(item: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItemLoaded()
    *
    * @param item
    */
  def isItemLoaded(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.loadItem()
    *
    * @param keywordArgs
    */
  def loadItem(keywordArgs: js.Any): Unit = js.native
}


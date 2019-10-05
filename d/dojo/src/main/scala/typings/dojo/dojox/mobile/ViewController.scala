package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ViewController.html
  *
  * A singleton class that controls view transition.
  * This class listens to the "startTransition" events and performs
  * view transitions. If the transition destination is an external
  * view specified with the url parameter, the view content is
  * retrieved and parsed to create a new target view.
  *
  */
@JSGlobal("dojox.mobile.ViewController")
@js.native
class ViewController () extends js.Object {
  /**
    * The data handler class used to load external views,
    * by default "dojox/mobile/dh/DataHandler"
    * (see the Data Handlers page in the reference documentation).
    *
    */
  var dataHandlerClass: js.Object = js.native
  /**
    * The data source class used to load external views,
    * by default "dojox/mobile/dh/UrlDataSource"
    * (see the Data Handlers page in the reference documentation).
    *
    */
  var dataSourceClass: js.Object = js.native
  /**
    * The file type map class used to load external views,
    * by default "dojox/mobile/dh/SuffixFileTypeMap"
    * (see the Data Handlers page in the reference documentation).
    *
    */
  var fileTypeMapClass: js.Object = js.native
  /**
    * Parses the moveTo argument and determines a starting view and a destination view.
    *
    * @param moveTo
    */
  def findTransitionViews(moveTo: String): js.Array[_] = js.native
  /**
    *
    */
  def getInstance(): Unit = js.native
  /**
    * A handler that performs view transition.
    *
    * @param evt
    */
  def onStartTransition(evt: js.Any): Unit = js.native
  /**
    * Loads an external view and performs a transition to it.
    * This method loads external view content through the
    * dojox/mobile data handlers, creates a new View instance with
    * the loaded content, and performs a view transition to the
    * new view. The external view content can be specified with
    * the url property of transOpts. The new view is created under
    * a DOM node specified by target.
    *
    * @param transOpts
    * @param target
    */
  def openExternalView(transOpts: js.Object, target: HTMLElement): js.Any = js.native
}


package typings.dojo.dojox.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.app.module")
@js.native
object module extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/module/env.html
    *
    *
    */
  @js.native
  class env () extends js.Object {
    /**
      *
      */
    var mode: String = js.native
    /**
      *
      */
    def init(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/module/lifecycle.html
    *
    *
    */
  @js.native
  class lifecycle () extends js.Object {
    /**
      *
      */
    var lifecycle: js.Object = js.native
    /**
      *
      */
    def getStatus(): js.Any = js.native
    /**
      *
      * @param newStatus
      */
    def setStatus(newStatus: js.Any): Unit = js.native
  }
  
}


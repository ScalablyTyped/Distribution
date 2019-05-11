package typings
package googleDashGaxLib.buildSrcPagedIterationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/pagedIteration", "PagedIteration")
@js.native
class PagedIteration protected ()
  extends googleDashGaxLib.buildSrcApiCallableMod.NormalApiCaller {
  /**
    * Creates an API caller that returns a stream to performs page-streaming.
    *
    * @private
    * @constructor
    * @param {PageDescriptor} pageDescriptor - indicates the structure
    *   of page streaming to be performed.
    */
  def this(pageDescriptor: PageDescriptor) = this()
  var pageDescriptor: PageDescriptor = js.native
  def call(
    apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall,
    argument: org.scalablytyped.runtime.StringDictionary[js.Object],
    settings: js.Any,
    canceller: js.Any
  ): scala.Unit = js.native
  def createActualCallback(
    request: org.scalablytyped.runtime.StringDictionary[js.Object],
    callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback
  ): js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* response */ org.scalablytyped.runtime.StringDictionary[js.Object], 
    scala.Unit
  ] = js.native
}


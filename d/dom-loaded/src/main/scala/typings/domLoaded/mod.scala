package typings.domLoaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dom-loaded", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`[TResult](): js.Promise[Unit | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Unit | TResult] = js.native
  
  /**
    * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
    * resolved value cannot be modified from the callback.
    * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
    * @returns A Promise for the completion of the callback.
    */
  def `finally`(): js.Promise[Unit] = js.native
  def `finally`(onfinally: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  /**
  	Synchronously check if the DOM has already finished loaded.
  	```
  	import domLoaded = require('dom-loaded');
  	if (domLoaded.hasLoaded) {
  		console.log('The DOM has already finished loading.')
  	}
  	```
  	*/
  var hasLoaded: Boolean = js.native
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Unit, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Unit, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: String = js.native
}

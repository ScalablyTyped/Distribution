package typings.domLoaded

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Promise<void> & { readonly hasLoaded :boolean} */
  object default {
    
    @JSImport("dom-loaded", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    /* standard es5 */
    inline def `catch`[TResult](): js.Promise[Unit | TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("catch")().asInstanceOf[js.Promise[Unit | TResult]]
    inline def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Unit | TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("catch")(onrejected.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | TResult]]
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    /* standard es2018.promise */
    inline def `finally`(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finally")().asInstanceOf[js.Promise[Unit]]
    inline def `finally`(onfinally: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finally")(onfinally.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
    	Synchronously check if the DOM has already finished loading.
    	```
    	import domLoaded from 'dom-loaded';
    	if (domLoaded.hasLoaded) {
    		console.log('The DOM has already finished loading.')
    	}
    	```
    	*/
    @JSImport("dom-loaded", "default.hasLoaded")
    @js.native
    val hasLoaded: Boolean = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    /* standard es5 */
    inline def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = ^.asInstanceOf[js.Dynamic].applyDynamic("then")().asInstanceOf[js.Promise[TResult1 | TResult2]]
    inline def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Unit, PromiseLike[TResult1] | TResult1]): js.Promise[TResult1 | TResult2] = ^.asInstanceOf[js.Dynamic].applyDynamic("then")(onfulfilled.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TResult1 | TResult2]]
    inline def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(onfulfilled.asInstanceOf[js.Any], onrejected.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TResult1 | TResult2]]
    inline def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(onfulfilled.asInstanceOf[js.Any], onrejected.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TResult1 | TResult2]]
    inline def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(onfulfilled.asInstanceOf[js.Any], onrejected.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TResult1 | TResult2]]
  }
}

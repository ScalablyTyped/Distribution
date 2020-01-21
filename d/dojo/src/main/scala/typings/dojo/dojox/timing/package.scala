package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object timing {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/timing/Streamer.html
    *
    * Streamer will take an input function that pushes N datapoints into a
    * queue, and will pass the next point in that queue out to an
    * output function at the passed interval; this way you can emulate
    * a constant buffered stream of data.
    *
    * @param input the function executed when the internal queue reaches minimumSize
    * @param output the function executed on internal tick
    * @param interval the interval in ms at which the output function is fired.
    * @param minimum the minimum number of elements in the internal queue.
    * @param initialData
    */
  type Streamer = js.Function5[
    /* input */ js.Function, 
    /* output */ js.Function, 
    /* interval */ scala.Double, 
    /* minimum */ scala.Double, 
    /* initialData */ js.Array[js.Any], 
    scala.Unit
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/timing/doLater.html
    *
    * Check if a parameter is ready, and if not,
    * "do later". doLater will ping the parameter
    * until it evaluates to something (truthy).
    * It thens calls the caller with original
    * arguments, using the supplied context or
    * window.
    * dojox.timing.doLater(conditional) is testing if the call
    * should be done later. So it returns
    * true if the param is false.
    *
    * @param conditional Can be a property that eventually gets set, oran expression, method... anything that can beevaluated.
    * @param context       OptionalThe namespace where the call originated.Defaults to global and anonymous functions
    * @param interval       OptionalPoll time to check conditional in Milliseconds
    */
  type doLater = js.Function3[
    /* conditional */ js.Any, 
    /* context */ js.UndefOr[js.Object], 
    /* interval */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}

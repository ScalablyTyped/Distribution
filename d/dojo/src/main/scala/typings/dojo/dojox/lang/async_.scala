package typings.dojo.dojox.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async.html
  *
  *
  */
trait async_ extends js.Object {
  /**
    * Executes functions in parallel. As soon as one of them finishes
    * cancels the rest.
    *
    * @param x
    */
  def any(x: js.Any): Unit
  /**
    * Executes a condition, waits for it if necessary, and executes
    * one of two functions.
    *
    * @param cond
    * @param ifTrue
    * @param ifFalse
    */
  def ifThen(cond: js.Any, ifTrue: js.Any, ifFalse: js.Any): Unit
  /**
    * Executes a condition, waits for it if necessary, and executes
    * the body, if truthy value was returned.
    * Then it repeats the cycle until the condition function returns
    * a falsy value.
    *
    * @param cond
    * @param body
    */
  def loop(cond: js.Any, body: js.Any): Unit
  /**
    * Executes functions in parallel. Waits for all of them to finish.
    *
    * @param x
    */
  def par(x: js.Any): Unit
  /**
    * Executes a condition, waits for it if necessary, and executes
    * Nth function from list.
    *
    * @param cond
    * @param x
    */
  def select(cond: js.Any, x: js.Any): Unit
  /**
    * Executes functions sequentially. Waits if any of them returns Deferred.
    *
    * @param x
    */
  def seq(x: js.Any): Unit
}

object async_ {
  @scala.inline
  def apply(
    any: js.Any => Unit,
    ifThen: (js.Any, js.Any, js.Any) => Unit,
    loop: (js.Any, js.Any) => Unit,
    par: js.Any => Unit,
    select: (js.Any, js.Any) => Unit,
    seq: js.Any => Unit
  ): async_ = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), ifThen = js.Any.fromFunction3(ifThen), loop = js.Any.fromFunction2(loop), par = js.Any.fromFunction1(par), select = js.Any.fromFunction2(select), seq = js.Any.fromFunction1(seq))
  
    __obj.asInstanceOf[async_]
  }
}


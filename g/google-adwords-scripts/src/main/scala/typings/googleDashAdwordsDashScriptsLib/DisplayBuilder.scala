package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Display
trait DisplayBuilder[T] extends AdWordsBuilder[T] {
  def exclude(): AdWordsOperation[T]
  def withCpc(cpc: scala.Double): T
  def withCpm(cpm: scala.Double): T
}

object DisplayBuilder {
  @scala.inline
  def apply[T](
    build: js.Function0[AdWordsOperation[T]],
    exclude: js.Function0[AdWordsOperation[T]],
    withCpc: js.Function1[scala.Double, T],
    withCpm: js.Function1[scala.Double, T]
  ): DisplayBuilder[T] = {
    val __obj = js.Dynamic.literal(build = build, exclude = exclude, withCpc = withCpc, withCpm = withCpm)
  
    __obj.asInstanceOf[DisplayBuilder[T]]
  }
}


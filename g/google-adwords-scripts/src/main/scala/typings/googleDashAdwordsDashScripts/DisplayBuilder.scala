package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Display
trait DisplayBuilder[T] extends AdWordsBuilder[T] {
  def exclude(): AdWordsOperation[T]
  def withCpc(cpc: Double): T
  def withCpm(cpm: Double): T
}

object DisplayBuilder {
  @scala.inline
  def apply[T](
    build: () => AdWordsOperation[T],
    exclude: () => AdWordsOperation[T],
    withCpc: Double => T,
    withCpm: Double => T
  ): DisplayBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
  
    __obj.asInstanceOf[DisplayBuilder[T]]
  }
}


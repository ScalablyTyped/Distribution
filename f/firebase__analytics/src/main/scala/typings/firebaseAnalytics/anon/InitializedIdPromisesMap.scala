package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializedIdPromisesMap extends js.Object {
  var initializedIdPromisesMap: StringDictionary[js.Promise[Unit]]
}

object InitializedIdPromisesMap {
  @scala.inline
  def apply(initializedIdPromisesMap: StringDictionary[js.Promise[Unit]]): InitializedIdPromisesMap = {
    val __obj = js.Dynamic.literal(initializedIdPromisesMap = initializedIdPromisesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializedIdPromisesMap]
  }
}


package typings.duckduckgoImagesApi.mod

import typings.duckduckgoImagesApi.anon.Iterations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("duckduckgo-images-api", "image_search")
@js.native
object imageSearch extends js.Object {
  def apply(params: Iterations): js.Promise[js.Array[DuckDuckGoImage]] = js.native
}


package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object giphyDashApiLib {
  type Callback = js.Function2[
    /* err */ stdLib.Error, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify giphyApi.Result */ /* res */ js.Any, 
    scala.Unit
  ]
  type Format = giphyDashApiLib.giphyDashApiLibStrings.html | giphyDashApiLib.giphyDashApiLibStrings.json
  type Rating = giphyDashApiLib.giphyDashApiLibStrings.y | giphyDashApiLib.giphyDashApiLibStrings.g | giphyDashApiLib.giphyDashApiLibStrings.pg | giphyDashApiLib.giphyDashApiLibStrings.`pg-13` | giphyDashApiLib.giphyDashApiLibStrings.r
}

package typings.fineDashUploader.libAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object azure {
  import typings.fineDashUploader.libCoreMod.PromiseOptions

  type AzureBlobPropertyNameFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  type AzureCustomHeaderFunction = js.Function1[/* id */ Double, Unit]
}

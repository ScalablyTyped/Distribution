package typings.fineUploader.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object azure {
  type AzureBlobPropertyNameFunction = js.Function1[
    /* id */ scala.Double, 
    typings.fineUploader.coreMod.PromiseOptions | java.lang.String
  ]
  type AzureCustomHeaderFunction = js.Function1[/* id */ scala.Double, scala.Unit]
}

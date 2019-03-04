package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBSDKCanvasPrefetcher extends js.Object {
  /* Tells Facebook that the current page uses a specified resource. */
  def addStaticResource(res: java.lang.String): scala.Unit
  /* Controls how statistics are collected on resources used by your application. */
  def setCollectionMode(option: java.lang.String): scala.Unit
}

object FBSDKCanvasPrefetcher {
  @scala.inline
  def apply(
    addStaticResource: js.Function1[java.lang.String, scala.Unit],
    setCollectionMode: js.Function1[java.lang.String, scala.Unit]
  ): FBSDKCanvasPrefetcher = {
    val __obj = js.Dynamic.literal(addStaticResource = addStaticResource, setCollectionMode = setCollectionMode)
  
    __obj.asInstanceOf[FBSDKCanvasPrefetcher]
  }
}


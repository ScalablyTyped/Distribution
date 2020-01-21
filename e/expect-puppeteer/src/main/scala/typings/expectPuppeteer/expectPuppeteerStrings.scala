package typings.expectPuppeteer

import typings.expectPuppeteer.mod._ExpectPolling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expectPuppeteerStrings {
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait middle extends js.Object
  
  @js.native
  sealed trait mutation extends _ExpectPolling
  
  @js.native
  sealed trait raf extends _ExpectPolling
  
  @js.native
  sealed trait right extends js.Object
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  @scala.inline
  def raf: raf = "raf".asInstanceOf[raf]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}


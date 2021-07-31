package typings.expectPuppeteer

import typings.expectPuppeteer.mod._ExpectPolling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expectPuppeteerStrings {
  
  @js.native
  sealed trait left extends StObject
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait middle extends StObject
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait mutation
    extends StObject
       with _ExpectPolling
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  
  @js.native
  sealed trait raf
    extends StObject
       with _ExpectPolling
  @scala.inline
  def raf: raf = "raf".asInstanceOf[raf]
  
  @js.native
  sealed trait right extends StObject
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}

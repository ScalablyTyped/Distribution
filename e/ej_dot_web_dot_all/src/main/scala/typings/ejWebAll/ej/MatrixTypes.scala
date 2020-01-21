package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatrixTypes extends js.Object

@JSGlobal("ej.MatrixTypes")
@js.native
object MatrixTypes extends js.Object {
  @js.native
  sealed trait Identity extends MatrixTypes
  
  @js.native
  sealed trait Scaling extends MatrixTypes
  
  @js.native
  sealed trait Translation extends MatrixTypes
  
  @js.native
  sealed trait Unknown extends MatrixTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatrixTypes with Double] = js.native
  /* 0 */ @js.native
  object Identity extends TopLevel[Identity with Double]
  
  /* 1 */ @js.native
  object Scaling extends TopLevel[Scaling with Double]
  
  /* 2 */ @js.native
  object Translation extends TopLevel[Translation with Double]
  
  /* 3 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}


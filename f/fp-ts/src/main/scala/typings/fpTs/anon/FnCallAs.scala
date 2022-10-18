package typings.fpTs.anon

import typings.fpTs.libNonEmptyArrayMod.NonEmptyArray_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallAs[B] extends StObject {
  
  def apply[A /* <: B */](as: js.Array[A]): js.Array[NonEmptyArray_[A]] = js.native
  def apply[A /* <: B */](as: NonEmptyArray_[A]): NonEmptyArray_[NonEmptyArray_[A]] = js.native
}

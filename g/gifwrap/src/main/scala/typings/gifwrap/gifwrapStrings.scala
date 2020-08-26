package typings.gifwrap

import typings.gifwrap.mod.DitherAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gifwrapStrings {
  @js.native
  sealed trait Atkinson extends DitherAlgorithm
  
  @js.native
  sealed trait Burkes extends DitherAlgorithm
  
  @js.native
  sealed trait FalseFloydSteinberg extends DitherAlgorithm
  
  @js.native
  sealed trait FloydSteinberg extends DitherAlgorithm
  
  @js.native
  sealed trait Jarvis extends DitherAlgorithm
  
  @js.native
  sealed trait Sierra extends DitherAlgorithm
  
  @js.native
  sealed trait SierraLite extends DitherAlgorithm
  
  @js.native
  sealed trait Stucki extends DitherAlgorithm
  
  @js.native
  sealed trait TwoSierra extends DitherAlgorithm
  
  @scala.inline
  def Atkinson: Atkinson = "Atkinson".asInstanceOf[Atkinson]
  @scala.inline
  def Burkes: Burkes = "Burkes".asInstanceOf[Burkes]
  @scala.inline
  def FalseFloydSteinberg: FalseFloydSteinberg = "FalseFloydSteinberg".asInstanceOf[FalseFloydSteinberg]
  @scala.inline
  def FloydSteinberg: FloydSteinberg = "FloydSteinberg".asInstanceOf[FloydSteinberg]
  @scala.inline
  def Jarvis: Jarvis = "Jarvis".asInstanceOf[Jarvis]
  @scala.inline
  def Sierra: Sierra = "Sierra".asInstanceOf[Sierra]
  @scala.inline
  def SierraLite: SierraLite = "SierraLite".asInstanceOf[SierraLite]
  @scala.inline
  def Stucki: Stucki = "Stucki".asInstanceOf[Stucki]
  @scala.inline
  def TwoSierra: TwoSierra = "TwoSierra".asInstanceOf[TwoSierra]
}


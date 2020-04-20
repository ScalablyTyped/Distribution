package typings.expoLinearGradient

import typings.expoLinearGradient.linearGradientMod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expoLinearGradientComponents extends expoLinearGradientProps {
  @scala.inline
  def LinearGradient: ComponentType[LinearGradientProps] = js.constructorOf[default].asInstanceOf[ComponentType[LinearGradientProps]]
  @scala.inline
  def NativeLinearGradientDotandroid: ComponentType[NativeLinearGradientDotandroidProps] = js.constructorOf[typings.expoLinearGradient.nativeLinearGradientAndroidMod.default].asInstanceOf[ComponentType[NativeLinearGradientDotandroidProps]]
  @scala.inline
  def NativeLinearGradientDotios: ComponentType[NativeLinearGradientDotiosProps] = js.constructorOf[typings.expoLinearGradient.nativeLinearGradientIosMod.default].asInstanceOf[ComponentType[NativeLinearGradientDotiosProps]]
  @scala.inline
  def NativeLinearGradientDotweb: ComponentType[NativeLinearGradientDotwebProps] = typings.expoLinearGradient.nativeLinearGradientWebMod.default.asInstanceOf[ComponentType[NativeLinearGradientDotwebProps]]
}


package typings.formol

import typings.formol.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formolComponents extends formolProps {
  @scala.inline
  def Conditional: ComponentType[ConditionalProps[js.Any]] = js.constructorOf[typings.formol.mod.Conditional].asInstanceOf[ComponentType[ConditionalProps[js.Any]]]
  @scala.inline
  def Field: ComponentType[FieldProps[js.Any]] = js.constructorOf[typings.formol.mod.Field].asInstanceOf[ComponentType[FieldProps[js.Any]]]
  @scala.inline
  def FieldSet: ComponentType[FieldSetProps[js.Any]] = js.constructorOf[typings.formol.mod.FieldSet].asInstanceOf[ComponentType[FieldSetProps[js.Any]]]
  @scala.inline
  def Formol: ComponentType[FormolProps[js.Any]] = js.constructorOf[default].asInstanceOf[ComponentType[FormolProps[js.Any]]]
  @scala.inline
  def Inliner: ComponentType[js.Object] = js.constructorOf[typings.formol.mod.Inliner].asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def SwitchButton: ComponentType[SwitchButtonProps] = js.constructorOf[typings.formol.mod.SwitchButton].asInstanceOf[ComponentType[SwitchButtonProps]]
}


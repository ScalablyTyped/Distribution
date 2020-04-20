package typings.emojiMart

import typings.emojiMart.categoryMod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emojiMartComponents extends emojiMartProps {
  @scala.inline
  def Category: ComponentType[CategoryProps] = js.constructorOf[default].asInstanceOf[ComponentType[CategoryProps]]
  @scala.inline
  def Emoji: ComponentType[EmojiProps] = typings.emojiMart.emojiMod.default.asInstanceOf[ComponentType[EmojiProps]]
  @scala.inline
  def NimbleEmoji: ComponentType[NimbleEmojiProps] = typings.emojiMart.nimbleEmojiMod.default.asInstanceOf[ComponentType[NimbleEmojiProps]]
  @scala.inline
  def NimblePicker: ComponentType[NimblePickerProps] = js.constructorOf[typings.emojiMart.nimblePickerMod.default].asInstanceOf[ComponentType[NimblePickerProps]]
  @scala.inline
  def Picker: ComponentType[PickerProps] = js.constructorOf[typings.emojiMart.pickerMod.default].asInstanceOf[ComponentType[PickerProps]]
}


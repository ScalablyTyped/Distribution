package typings
package detoxLib.detoxMod.Global.DetoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expect[R] extends js.Object {
  def apply(element: Element): Expect[_] = js.native
  /**
    * Expect the view to not be visible.
    * @example await expect(element(by.id('UniqueId205'))).toBeNotVisible();
    */
  def toBeNotVisible(): R = js.native
  /**
    * Expect the view to be at least 75% visible.
    * @example await expect(element(by.id('UniqueId204'))).toBeVisible();
    */
  def toBeVisible(): R = js.native
  /**
    * Expect the view to exist in the UI hierarchy.
    * @example await expect(element(by.id('UniqueId205'))).toExist();
    */
  def toExist(): R = js.native
  /**
    * In React Native apps, expect UI component to have testID with that id.
    * In native iOS apps, expect UI element to have accesibilityIdentifier with that id.
    * @param id
    * @example await expect(element(by.text('I contain some text'))).toHaveId('UniqueId204');
    */
  def toHaveId(id: java.lang.String): R = js.native
  /**
    * It searches by accessibilityLabel on iOS, or by contentDescription on Android.
    * In React Native it can be set for both platforms by defining an accessibilityLabel on the view.
    * @param label
    * @example await expect(element(by.id('UniqueId204'))).toHaveLabel('Done');
    */
  def toHaveLabel(label: java.lang.String): R = js.native
  /**
    * In React Native apps, expect UI component of type <Text> to have text.
    * In native iOS apps, expect UI elements of type UIButton, UILabel, UITextField or UITextViewIn to have inputText with text.
    * @param text
    * @example await expect(element(by.id('UniqueId204'))).toHaveText('I contain some text');
    */
  def toHaveText(text: java.lang.String): R = js.native
  /**
    * Expect components like a Switch to have a value ('0' for off, '1' for on).
    * @param value
    * @example await expect(element(by.id('UniqueId533'))).toHaveValue('0');
    */
  def toHaveValue(value: js.Any): R = js.native
  /**
    * Expect the view to not exist in the UI hierarchy.
    * @example await expect(element(by.id('RandomJunk959'))).toNotExist();
    */
  def toNotExist(): R = js.native
}


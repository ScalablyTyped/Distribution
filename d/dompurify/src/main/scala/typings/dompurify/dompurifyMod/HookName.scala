package typings.dompurify.dompurifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dompurify.dompurifyStrings.beforeSanitizeElements
  - typings.dompurify.dompurifyStrings.uponSanitizeElement
  - typings.dompurify.dompurifyStrings.afterSanitizeElements
  - typings.dompurify.dompurifyStrings.beforeSanitizeAttributes
  - typings.dompurify.dompurifyStrings.uponSanitizeAttribute
  - typings.dompurify.dompurifyStrings.afterSanitizeAttributes
  - typings.dompurify.dompurifyStrings.beforeSanitizeShadowDOM
  - typings.dompurify.dompurifyStrings.uponSanitizeShadowNode
  - typings.dompurify.dompurifyStrings.afterSanitizeShadowDOM
*/
trait HookName extends js.Object

object HookName {
  @scala.inline
  def afterSanitizeAttributes: typings.dompurify.dompurifyStrings.afterSanitizeAttributes = this.cast("afterSanitizeAttributes")
  @scala.inline
  def afterSanitizeElements: typings.dompurify.dompurifyStrings.afterSanitizeElements = this.cast("afterSanitizeElements")
  @scala.inline
  def afterSanitizeShadowDOM: typings.dompurify.dompurifyStrings.afterSanitizeShadowDOM = this.cast("afterSanitizeShadowDOM")
  @scala.inline
  def beforeSanitizeAttributes: typings.dompurify.dompurifyStrings.beforeSanitizeAttributes = this.cast("beforeSanitizeAttributes")
  @scala.inline
  def beforeSanitizeElements: typings.dompurify.dompurifyStrings.beforeSanitizeElements = this.cast("beforeSanitizeElements")
  @scala.inline
  def beforeSanitizeShadowDOM: typings.dompurify.dompurifyStrings.beforeSanitizeShadowDOM = this.cast("beforeSanitizeShadowDOM")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def uponSanitizeAttribute: typings.dompurify.dompurifyStrings.uponSanitizeAttribute = this.cast("uponSanitizeAttribute")
  @scala.inline
  def uponSanitizeElement: typings.dompurify.dompurifyStrings.uponSanitizeElement = this.cast("uponSanitizeElement")
  @scala.inline
  def uponSanitizeShadowNode: typings.dompurify.dompurifyStrings.uponSanitizeShadowNode = this.cast("uponSanitizeShadowNode")
}


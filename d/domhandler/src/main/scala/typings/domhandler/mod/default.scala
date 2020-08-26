package typings.domhandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", JSImport.Default)
@js.native
/**
  * Initiate a new DomHandler.
  *
  * @param callback Called once parsing has completed.
  * @param options Settings for the handler.
  * @param elementCB Callback whenever a tag is closed.
  */
class default () extends DomHandler {
  def this(callback: Callback) = this()
  def this(callback: js.UndefOr[scala.Nothing], options: DomHandlerOptions) = this()
  def this(callback: Null, options: DomHandlerOptions) = this()
  def this(callback: Callback, options: DomHandlerOptions) = this()
  def this(
    callback: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    elementCB: ElementCallback
  ) = this()
  def this(callback: js.UndefOr[scala.Nothing], options: Null, elementCB: ElementCallback) = this()
  def this(callback: js.UndefOr[scala.Nothing], options: DomHandlerOptions, elementCB: ElementCallback) = this()
  def this(callback: Null, options: js.UndefOr[scala.Nothing], elementCB: ElementCallback) = this()
  def this(callback: Null, options: Null, elementCB: ElementCallback) = this()
  def this(callback: Null, options: DomHandlerOptions, elementCB: ElementCallback) = this()
  def this(callback: Callback, options: js.UndefOr[scala.Nothing], elementCB: ElementCallback) = this()
  def this(callback: Callback, options: Null, elementCB: ElementCallback) = this()
  def this(callback: Callback, options: DomHandlerOptions, elementCB: ElementCallback) = this()
}


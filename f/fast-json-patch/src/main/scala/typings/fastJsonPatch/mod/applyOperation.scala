package typings.fastJsonPatch.mod

import typings.fastJsonPatch.moduleCoreMod.Operation
import typings.fastJsonPatch.moduleCoreMod.OperationResult
import typings.fastJsonPatch.moduleCoreMod.Validator_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "applyOperation")
@js.native
object applyOperation extends js.Object {
  def apply[T](document: T, operation: Operation): OperationResult[T] = js.native
  def apply[T](document: T, operation: Operation, validateOperation: Boolean): OperationResult[T] = js.native
  def apply[T](document: T, operation: Operation, validateOperation: Boolean, mutateDocument: Boolean): OperationResult[T] = js.native
  def apply[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  def apply[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  def apply[T](document: T, operation: Operation, validateOperation: Validator_[T]): OperationResult[T] = js.native
  def apply[T](document: T, operation: Operation, validateOperation: Validator_[T], mutateDocument: Boolean): OperationResult[T] = js.native
  def apply[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  def apply[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
}


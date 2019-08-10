package typings.fastDashJsonDashPatch

import typings.fastDashJsonDashPatch.libCoreMod.Operation
import typings.fastDashJsonDashPatch.libCoreMod.OperationResult
import typings.fastDashJsonDashPatch.libCoreMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BanPrototypeModifications extends js.Object {
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
  def apply[T](document: T, operation: Operation, validateOperation: Validator[T]): OperationResult[T] = js.native
  def apply[T](document: T, operation: Operation, validateOperation: Validator[T], mutateDocument: Boolean): OperationResult[T] = js.native
  def apply[T](
    document: T,
    operation: Operation,
    validateOperation: Validator[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  def apply[T](
    document: T,
    operation: Operation,
    validateOperation: Validator[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
}


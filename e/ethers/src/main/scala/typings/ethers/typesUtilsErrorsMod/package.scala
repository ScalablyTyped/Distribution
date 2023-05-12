package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.CANCELLED
import typings.ethers.ethersStrings.code
import typings.ethers.ethersStrings.message
import typings.ethers.ethersStrings.name
import typings.ethers.typesUtilsErrorsMod.^
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def assert[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](check: Any, message: String, code: K): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]
inline def assert[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](check: Any, message: String, code: K, info: ErrorInfo[T]): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]

inline def assertArgument(check: Any, message: String, name: String, value: Any): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgument")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]

inline def assertArgumentCount(count: Double, expectedCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentCount")(count.asInstanceOf[js.Any], expectedCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArgumentCount(count: Double, expectedCount: Double, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentCount")(count.asInstanceOf[js.Any], expectedCount.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNormalize(form: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNormalize")(form.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def assertPrivate(givenGuard: Any, guard: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(givenGuard.asInstanceOf[js.Any], guard.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPrivate(givenGuard: Any, guard: Any, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(givenGuard.asInstanceOf[js.Any], guard.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def isCallException(error: Any): /* is ethers.ethers/types/utils/errors.CallExceptionError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallException")(error.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/utils/errors.CallExceptionError */ Boolean]

inline def isError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](error: Any, code: K): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isError")(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]

inline def makeError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](message: String, code: K): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[T]
inline def makeError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](message: String, code: K, info: ErrorInfo[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[T]

type CancelledError = EthersError[CANCELLED]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'UNKNOWN_ERROR' ? ethers.ethers/types/utils/errors.UnknownError : T extends 'NOT_IMPLEMENTED' ? ethers.ethers/types/utils/errors.NotImplementedError : T extends 'UNSUPPORTED_OPERATION' ? ethers.ethers/types/utils/errors.UnsupportedOperationError : T extends 'NETWORK_ERROR' ? ethers.ethers/types/utils/errors.NetworkError : T extends 'SERVER_ERROR' ? ethers.ethers/types/utils/errors.ServerError : T extends 'TIMEOUT' ? ethers.ethers/types/utils/errors.TimeoutError : T extends 'BAD_DATA' ? ethers.ethers/types/utils/errors.BadDataError : T extends 'CANCELLED' ? ethers.ethers/types/utils/errors.CancelledError : T extends 'BUFFER_OVERRUN' ? ethers.ethers/types/utils/errors.BufferOverrunError : T extends 'NUMERIC_FAULT' ? ethers.ethers/types/utils/errors.NumericFaultError : T extends 'INVALID_ARGUMENT' ? ethers.ethers/types/utils/errors.InvalidArgumentError : T extends 'MISSING_ARGUMENT' ? ethers.ethers/types/utils/errors.MissingArgumentError : T extends 'UNEXPECTED_ARGUMENT' ? ethers.ethers/types/utils/errors.UnexpectedArgumentError : T extends 'CALL_EXCEPTION' ? ethers.ethers/types/utils/errors.CallExceptionError : T extends 'INSUFFICIENT_FUNDS' ? ethers.ethers/types/utils/errors.InsufficientFundsError : T extends 'NONCE_EXPIRED' ? ethers.ethers/types/utils/errors.NonceExpiredError : T extends 'OFFCHAIN_FAULT' ? ethers.ethers/types/utils/errors.OffchainFaultError : T extends 'REPLACEMENT_UNDERPRICED' ? ethers.ethers/types/utils/errors.ReplacementUnderpricedError : T extends 'TRANSACTION_REPLACED' ? ethers.ethers/types/utils/errors.TransactionReplacedError : T extends 'UNCONFIGURED_NAME' ? ethers.ethers/types/utils/errors.UnconfiguredNameError : T extends 'ACTION_REJECTED' ? ethers.ethers/types/utils/errors.ActionRejectedError : never
  }}}
  */
type CodedEthersError[T] = UnknownError

type ErrorInfo[T] = Omit[T, code | name | message]

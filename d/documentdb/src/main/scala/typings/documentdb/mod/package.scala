package typings.documentdb.mod

import typings.documentdb.documentdbStrings.Hash
import typings.documentdb.documentdbStrings.Javascript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DatabaseMeta = AbstractMeta

type DocumentQuery = SqlQuerySpec | String

type PartitionKind = Hash

type Procedure = UserScriptable

type RequestCallback[TResult] = js.Function3[/* error */ QueryError, /* resource */ TResult, /* responseHeaders */ Any, Unit]

type UserDefinedFunctionMeta = AbstractMeta

type UserDefinedFunctionType = Javascript

type UserFunction = (js.Function1[/* repeated */ Any, Unit]) | String

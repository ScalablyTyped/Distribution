package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DatabaseMeta = typings.documentdb.mod.AbstractMeta

type DocumentQuery = typings.documentdb.mod.SqlQuerySpec | java.lang.String

type PartitionKind = typings.documentdb.documentdbStrings.Hash

type Procedure = typings.documentdb.mod.UserScriptable

type RequestCallback[TResult] = js.Function3[
/* error */ typings.documentdb.mod.QueryError, 
/* resource */ TResult, 
/* responseHeaders */ js.Any, 
scala.Unit]

type UserDefinedFunctionMeta = typings.documentdb.mod.AbstractMeta

type UserDefinedFunctionType = typings.documentdb.documentdbStrings.Javascript

type UserFunction = (js.Function1[/* repeated */ js.Any, scala.Unit]) | java.lang.String

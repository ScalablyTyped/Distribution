package typings.enhancedResolve.mod

import org.scalablytyped.runtime.StringDictionary
import typings.enhancedResolve.anon.Apply
import typings.enhancedResolve.enhancedResolveBooleans.`false`
import typings.enhancedResolve.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(
  context: js.Object,
  path: String,
  request: String,
  callback: js.Function3[
  /* err */ Null | ErrorWithDetail, 
  /* res */ js.UndefOr[String | `false`], 
  /* req */ js.UndefOr[ResolveRequest], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], path.asInstanceOf[js.Any], request.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def apply(
  context: js.Object,
  path: String,
  request: String,
  resolveContext: ResolveContext,
  callback: js.Function3[
  /* err */ Null | ErrorWithDetail, 
  /* res */ js.UndefOr[String | `false`], 
  /* req */ js.UndefOr[ResolveRequest], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], path.asInstanceOf[js.Any], request.asInstanceOf[js.Any], resolveContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def apply(
  path: String,
  request: String,
  callback: js.Function3[
  /* err */ Null | ErrorWithDetail, 
  /* res */ js.UndefOr[String | `false`], 
  /* req */ js.UndefOr[ResolveRequest], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], request.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def apply(
  path: String,
  request: String,
  resolveContext: ResolveContext,
  callback: js.Function3[
  /* err */ Null | ErrorWithDetail, 
  /* res */ js.UndefOr[String | `false`], 
  /* req */ js.UndefOr[ResolveRequest], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], request.asInstanceOf[js.Any], resolveContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def forEachBail(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("forEachBail")().asInstanceOf[Any]
inline def forEachBail(array: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("forEachBail")(array.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def forEachBail(array: Any, iterator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachBail")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def forEachBail(array: Any, iterator: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachBail")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def forEachBail(array: Any, iterator: Unit, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachBail")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def forEachBail(array: Unit, iterator: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachBail")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def forEachBail(array: Unit, iterator: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachBail")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def forEachBail(array: Unit, iterator: Unit, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachBail")(array.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def sync: ResolveFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("sync").asInstanceOf[ResolveFunction]

type AliasOptionNewRequest = String | `false` | js.Array[String]

type AliasOptions = StringDictionary[AliasOptionNewRequest]

type ExtensionAliasOptions = StringDictionary[String | js.Array[String]]

type FileSystemCallback[T] = js.Function2[
/* err */ js.UndefOr[Null | (PossibleFileSystemError & js.Error)], 
/* result */ js.UndefOr[T], 
Any]

type Plugin = Apply | (js.ThisFunction1[/* this */ Resolver, /* arg1 */ Resolver, Unit])

type ResolveCallback = js.Function3[
/* err */ Null | ErrorWithDetail, 
/* res */ js.UndefOr[String | `false`], 
/* req */ js.UndefOr[ResolveRequest], 
Unit]

package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.categoryMod.Category2
import typings.fpTs.choiceMod.Choice2
import typings.fpTs.functorMod.Functor2
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.profunctorMod.Profunctor2
import typings.fpTs.readerMod.Reader_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.strongMod.Strong2
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reader {
  
  @JSImport("fp-ts", "reader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "reader.Applicative")
  @js.native
  val Applicative: Applicative2[typings.fpTs.readerMod.URI] = js.native
  
  @JSImport("fp-ts", "reader.Category")
  @js.native
  val Category: Category2[typings.fpTs.readerMod.URI] = js.native
  
  @JSImport("fp-ts", "reader.Choice")
  @js.native
  val Choice: Choice2[typings.fpTs.readerMod.URI] = js.native
  
  @JSImport("fp-ts", "reader.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.readerMod.URI] = js.native
  
  @JSImport("fp-ts", "reader.Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.readerMod.URI] = js.native
  
  @JSImport("fp-ts", "reader.Profunctor")
  @js.native
  val Profunctor: Profunctor2[typings.fpTs.readerMod.URI] = js.native
  
  @JSImport("fp-ts", "reader.Strong")
  @js.native
  val Strong: Strong2[typings.fpTs.readerMod.URI] = js.native
  
  @JSImport("fp-ts", "reader.URI")
  @js.native
  val URI: /* "Reader" */ String = js.native
  
  inline def ap[R, A](fa: Reader_[R, A]): js.Function1[/* fab */ Reader_[R, js.Function1[/* a */ A, js.Any]], Reader_[R, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Reader_[R, js.Function1[/* a */ A, js.Any]], Reader_[R, js.Any]]]
  
  inline def apFirst[R, B](fb: Reader_[R, B]): js.Function1[/* fa */ Reader_[R, js.Any], Reader_[R, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Reader_[R, js.Any], Reader_[R, js.Any]]]
  
  inline def apS[A, N /* <: String */, R, B](name: Exclude[N, /* keyof A */ String], fb: Reader_[R, B]): js.Function1[
    /* fa */ Reader_[R, A], 
    Reader_[
      R, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[R, A], 
    Reader_[
      R, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, Q, B](name: Exclude[N, /* keyof A */ String], fb: Reader_[Q, B]): js.Function1[
    /* fa */ Reader_[js.Any, A], 
    Reader_[
      Q & js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[js.Any, A], 
    Reader_[
      Q & js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[R, B](fb: Reader_[R, B]): js.Function1[/* fa */ Reader_[R, js.Any], Reader_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Reader_[R, js.Any], Reader_[R, B]]]
  
  inline def apW[Q, A](fa: Reader_[Q, A]): js.Function1[
    /* fab */ Reader_[js.Any, js.Function1[/* a */ A, js.Any]], 
    Reader_[Q & js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ Reader_[js.Any, js.Function1[/* a */ A, js.Any]], 
    Reader_[Q & js.Any, js.Any]
  ]]
  
  inline def ask[R](): Reader_[R, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[Reader_[R, R]]
  
  inline def asks[R, A](f: js.Function1[/* r */ R, A]): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def bind[N /* <: String */, A, R, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[
    /* fa */ Reader_[R, A], 
    Reader_[
      R, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[R, A], 
    Reader_[
      R, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Reader_[js.Any, js.Any], 
    Reader_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[js.Any, js.Any], 
    Reader_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, Q, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Reader_[Q, B]]): js.Function1[
    /* fa */ Reader_[js.Any, A], 
    Reader_[
      Q & js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Reader_[js.Any, A], 
    Reader_[
      Q & js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  inline def chain[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ Reader_[R, A], Reader_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[R, A], Reader_[R, B]]]
  
  inline def chainFirst[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ Reader_[R, A], Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[R, A], Reader_[R, A]]]
  
  inline def chainW[R, A, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ Reader_[js.Any, A], Reader_[js.Any & R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[js.Any, A], Reader_[js.Any & R, B]]]
  
  inline def compose[A, B](ab: Reader_[A, B]): js.Function1[/* bc */ Reader_[B, js.Any], Reader_[A, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* bc */ Reader_[B, js.Any], Reader_[A, js.Any]]]
  
  inline def flatten[R, A](mma: Reader_[R, Reader_[R, A]]): Reader_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Reader_[R, A]]
  
  inline def getMonoid[R, A](M: Monoid[A]): Monoid[Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Reader_[R, A]]]
  
  inline def getSemigroup[R, A](S: Semigroup[A]): Semigroup[Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Reader_[R, A]]]
  
  @JSImport("fp-ts", "reader.id")
  @js.native
  val id: js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, A> */ js.Any
  ] = js.native
  
  inline def local[Q, R](f: js.Function1[/* d */ Q, R]): js.Function1[/* ma */ Reader_[R, js.Any], Reader_[Q, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Reader_[R, js.Any], Reader_[Q, js.Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Reader_[js.Any, A], Reader_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Reader_[js.Any, A], Reader_[js.Any, B]]]
  
  @JSImport("fp-ts", "reader.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ] = js.native
  
  inline def promap[E, A, D, B](f: js.Function1[/* d */ D, E], g: js.Function1[/* a */ A, B]): js.Function1[/* fbc */ Reader_[E, A], Reader_[D, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fbc */ Reader_[E, A], Reader_[D, B]]]
  
  @JSImport("fp-ts", "reader.reader")
  @js.native
  val reader: Monad2[typings.fpTs.readerMod.URI] & Profunctor2[typings.fpTs.readerMod.URI] & Category2[typings.fpTs.readerMod.URI] & Strong2[typings.fpTs.readerMod.URI] & Choice2[typings.fpTs.readerMod.URI] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}

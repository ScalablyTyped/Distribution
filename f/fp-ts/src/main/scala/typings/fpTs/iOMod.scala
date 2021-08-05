package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.chainRecMod.ChainRec1
import typings.fpTs.functorMod.Functor1
import typings.fpTs.monadIOMod.MonadIO1
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.semigroupMod.Semigroup
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iOMod {
  
  @JSImport("fp-ts/lib/IO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/IO", "Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.iOMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IO", "ChainRec")
  @js.native
  val ChainRec: ChainRec1[typings.fpTs.iOMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IO", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.iOMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IO", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.iOMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IO", "MonadIO")
  @js.native
  val MonadIO: MonadIO1[typings.fpTs.iOMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IO", "URI")
  @js.native
  val URI: /* "IO" */ String = js.native
  type URI = /* "IO" */ String
  
  inline def ap[A](fa: IO_[A]): js.Function1[/* fab */ IO_[js.Function1[/* a */ A, js.Any]], IO_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IO_[js.Function1[/* a */ A, js.Any]], IO_[js.Any]]]
  
  inline def apFirst[B](fb: IO_[B]): js.Function1[/* fa */ IO_[js.Any], IO_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IO_[js.Any], IO_[js.Any]]]
  
  inline def apS[A, N /* <: String */, B](name: Exclude[N, /* keyof A */ String], fb: IO_[B]): js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[B](fb: IO_[B]): js.Function1[/* fa */ IO_[js.Any], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IO_[js.Any], IO_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IO_[B]]): js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IO_[A], 
    IO_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ IO_[js.Any], 
    IO_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ IO_[js.Any], 
    IO_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IO_[A], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IO_[A], IO_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IO_[A], IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IO_[A], IO_[A]]]
  
  inline def flatten[A](mma: IO_[IO_[A]]): IO_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[IO_[A]]
  
  @JSImport("fp-ts/lib/IO", "fromIO")
  @js.native
  val fromIO: js.Function1[
    /* fa */ IO_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
  ] = js.native
  
  inline def getMonoid[A](M: Monoid[A]): Monoid[IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[IO_[A]]]
  
  inline def getSemigroup[A](S: Semigroup[A]): Semigroup[IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[IO_[A]]]
  
  @JSImport("fp-ts/lib/IO", "io")
  @js.native
  val io: Monad1[typings.fpTs.iOMod.URI] & MonadIO1[typings.fpTs.iOMod.URI] & ChainRec1[typings.fpTs.iOMod.URI] = js.native
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IO_[A], IO_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IO_[A], IO_[B]]]
  
  @JSImport("fp-ts/lib/IO", "of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type IO_[A] = js.Function0[A]
}

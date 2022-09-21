package typings.gamedig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gamedig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def query(options: QueryOptions): js.Promise[QueryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QueryResult]]
  inline def query(options: QueryOptions, callback: js.Function2[/* error */ Any, /* state */ QueryResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Player extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var ping: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[js.Object] = js.undefined
    
    var score: js.UndefOr[Double] = js.undefined
    
    var team: js.UndefOr[String] = js.undefined
  }
  object Player {
    
    inline def apply(): Player = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Player]
    }
    
    extension [Self <: Player](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
      
      inline def setRaw(value: js.Object): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
      
      inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  trait QueryOptions extends StObject {
    
    var attemptTimeout: js.UndefOr[Double] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var givenPortOnly: js.UndefOr[Boolean] = js.undefined
    
    var host: String
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var requestRules: js.UndefOr[Boolean] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    var `type`: Type
  }
  object QueryOptions {
    
    inline def apply(host: String, `type`: Type): QueryOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryOptions]
    }
    
    extension [Self <: QueryOptions](x: Self) {
      
      inline def setAttemptTimeout(value: Double): Self = StObject.set(x, "attemptTimeout", value.asInstanceOf[js.Any])
      
      inline def setAttemptTimeoutUndefined: Self = StObject.set(x, "attemptTimeout", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGivenPortOnly(value: Boolean): Self = StObject.set(x, "givenPortOnly", value.asInstanceOf[js.Any])
      
      inline def setGivenPortOnlyUndefined: Self = StObject.set(x, "givenPortOnly", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRequestRules(value: Boolean): Self = StObject.set(x, "requestRules", value.asInstanceOf[js.Any])
      
      inline def setRequestRulesUndefined: Self = StObject.set(x, "requestRules", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryResult extends StObject {
    
    var bots: js.Array[Player]
    
    var connect: String
    
    var map: String
    
    var maxplayers: Double
    
    var name: String
    
    var password: Boolean
    
    var ping: Double
    
    var players: js.Array[Player]
    
    var raw: js.UndefOr[js.Object] = js.undefined
  }
  object QueryResult {
    
    inline def apply(
      bots: js.Array[Player],
      connect: String,
      map: String,
      maxplayers: Double,
      name: String,
      password: Boolean,
      ping: Double,
      players: js.Array[Player]
    ): QueryResult = {
      val __obj = js.Dynamic.literal(bots = bots.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], maxplayers = maxplayers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], players = players.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResult]
    }
    
    extension [Self <: QueryResult](x: Self) {
      
      inline def setBots(value: js.Array[Player]): Self = StObject.set(x, "bots", value.asInstanceOf[js.Any])
      
      inline def setBotsVarargs(value: Player*): Self = StObject.set(x, "bots", js.Array(value*))
      
      inline def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMaxplayers(value: Double): Self = StObject.set(x, "maxplayers", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
      
      inline def setPlayers(value: js.Array[Player]): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      inline def setPlayersVarargs(value: Player*): Self = StObject.set(x, "players", js.Array(value*))
      
      inline def setRaw(value: js.Object): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gamedig.gamedigStrings.`7d2d`
    - typings.gamedig.gamedigStrings.ageofchivalry
    - typings.gamedig.gamedigStrings.aoe2
    - typings.gamedig.gamedigStrings.alienarena
    - typings.gamedig.gamedigStrings.alienswarm
    - typings.gamedig.gamedigStrings.arkse
    - typings.gamedig.gamedigStrings.assettocorsa
    - typings.gamedig.gamedigStrings.atlas
    - typings.gamedig.gamedigStrings.avp2
    - typings.gamedig.gamedigStrings.avp2010
    - typings.gamedig.gamedigStrings.americasarmy
    - typings.gamedig.gamedigStrings.americasarmy2
    - typings.gamedig.gamedigStrings.americasarmy3
    - typings.gamedig.gamedigStrings.americasarmypg
    - typings.gamedig.gamedigStrings.arcasimracing
    - typings.gamedig.gamedigStrings.arma
    - typings.gamedig.gamedigStrings.arma2
    - typings.gamedig.gamedigStrings.arma2oa
    - typings.gamedig.gamedigStrings.armacwa
    - typings.gamedig.gamedigStrings.armar
    - typings.gamedig.gamedigStrings.arma3
    - typings.gamedig.gamedigStrings.armagetron
    - typings.gamedig.gamedigStrings.baldursgate
    - typings.gamedig.gamedigStrings.bat1944
    - typings.gamedig.gamedigStrings.bf1942
    - typings.gamedig.gamedigStrings.bfv
    - typings.gamedig.gamedigStrings.bf2
    - typings.gamedig.gamedigStrings.bf2142
    - typings.gamedig.gamedigStrings.bfbc2
    - typings.gamedig.gamedigStrings.bf3
    - typings.gamedig.gamedigStrings.bf4
    - typings.gamedig.gamedigStrings.bfh
    - typings.gamedig.gamedigStrings.breach
    - typings.gamedig.gamedigStrings.breed
    - typings.gamedig.gamedigStrings.brink
    - typings.gamedig.gamedigStrings.buildandshoot
    - typings.gamedig.gamedigStrings.cod
    - typings.gamedig.gamedigStrings.coduo
    - typings.gamedig.gamedigStrings.cod2
    - typings.gamedig.gamedigStrings.cod3
    - typings.gamedig.gamedigStrings.cod4
    - typings.gamedig.gamedigStrings.codwaw
    - typings.gamedig.gamedigStrings.codmw2
    - typings.gamedig.gamedigStrings.codmw3
    - typings.gamedig.gamedigStrings.callofjuarez
    - typings.gamedig.gamedigStrings.chaser
    - typings.gamedig.gamedigStrings.chrome
    - typings.gamedig.gamedigStrings.codenameeagle
    - typings.gamedig.gamedigStrings.commandos3
    - typings.gamedig.gamedigStrings.cacrenegade
    - typings.gamedig.gamedigStrings.conanexiles
    - typings.gamedig.gamedigStrings.contagion
    - typings.gamedig.gamedigStrings.contactjack
    - typings.gamedig.gamedigStrings.cs15
    - typings.gamedig.gamedigStrings.cs16
    - typings.gamedig.gamedigStrings.cs2d
    - typings.gamedig.gamedigStrings.cscz
    - typings.gamedig.gamedigStrings.css
    - typings.gamedig.gamedigStrings.csgo
    - typings.gamedig.gamedigStrings.crossracing
    - typings.gamedig.gamedigStrings.crysis
    - typings.gamedig.gamedigStrings.crysiswars
    - typings.gamedig.gamedigStrings.crysis2
    - typings.gamedig.gamedigStrings.daikatana
    - typings.gamedig.gamedigStrings.dmomam
    - typings.gamedig.gamedigStrings.darkesthour
    - typings.gamedig.gamedigStrings.daysofwar
    - typings.gamedig.gamedigStrings.dayz
    - typings.gamedig.gamedigStrings.dayzmod
    - typings.gamedig.gamedigStrings.deadlydozenpt
    - typings.gamedig.gamedigStrings.dh2005
    - typings.gamedig.gamedigStrings.descent3
    - typings.gamedig.gamedigStrings.deusex
    - typings.gamedig.gamedigStrings.devastation
    - typings.gamedig.gamedigStrings.dinodday
    - typings.gamedig.gamedigStrings.dirttrackracing2
    - typings.gamedig.gamedigStrings.dnl
    - typings.gamedig.gamedigStrings.dod
    - typings.gamedig.gamedigStrings.dods
    - typings.gamedig.gamedigStrings.doi
    - typings.gamedig.gamedigStrings.doom3
    - typings.gamedig.gamedigStrings.dota2
    - typings.gamedig.gamedigStrings.drakan
    - typings.gamedig.gamedigStrings.empyrion
    - typings.gamedig.gamedigStrings.etqw
    - typings.gamedig.gamedigStrings.fear
    - typings.gamedig.gamedigStrings.f12002
    - typings.gamedig.gamedigStrings.f1c9902
    - typings.gamedig.gamedigStrings.farcry
    - typings.gamedig.gamedigStrings.farcry2
    - typings.gamedig.gamedigStrings.fortressforever
    - typings.gamedig.gamedigStrings.operationflashpoint
    - typings.gamedig.gamedigStrings.flashpoint
    - typings.gamedig.gamedigStrings.flashpointresistance
    - typings.gamedig.gamedigStrings.ffow
    - typings.gamedig.gamedigStrings.fivem
    - typings.gamedig.gamedigStrings.forrest
    - typings.gamedig.gamedigStrings.garrysmod
    - typings.gamedig.gamedigStrings.graw
    - typings.gamedig.gamedigStrings.graw2
    - typings.gamedig.gamedigStrings.giantscitizenkabuto
    - typings.gamedig.gamedigStrings.globaloperations
    - typings.gamedig.gamedigStrings.geneshift
    - typings.gamedig.gamedigStrings.mutantfactions
    - typings.gamedig.gamedigStrings.ges
    - typings.gamedig.gamedigStrings.gore
    - typings.gamedig.gamedigStrings.gunmanchronicles
    - typings.gamedig.gamedigStrings.hldm
    - typings.gamedig.gamedigStrings.hldms
    - typings.gamedig.gamedigStrings.hl2dm
    - typings.gamedig.gamedigStrings.halo
    - typings.gamedig.gamedigStrings.halo2
    - typings.gamedig.gamedigStrings.heretic2
    - typings.gamedig.gamedigStrings.hexen2
    - typings.gamedig.gamedigStrings.hidden
    - typings.gamedig.gamedigStrings.hll
    - typings.gamedig.gamedigStrings.had2
    - typings.gamedig.gamedigStrings.homefront
    - typings.gamedig.gamedigStrings.homeworld2
    - typings.gamedig.gamedigStrings.hurtworld
    - typings.gamedig.gamedigStrings.igi2
    - typings.gamedig.gamedigStrings.il2
    - typings.gamedig.gamedigStrings.insurgency
    - typings.gamedig.gamedigStrings.insurgencysandstorm
    - typings.gamedig.gamedigStrings.ironstorm
    - typings.gamedig.gamedigStrings.jamesbondnightfire
    - typings.gamedig.gamedigStrings.jc2mp
    - typings.gamedig.gamedigStrings.jc3mp
    - typings.gamedig.gamedigStrings.killingfloor
    - typings.gamedig.gamedigStrings.killingfloor2
    - typings.gamedig.gamedigStrings.kingpin
    - typings.gamedig.gamedigStrings.kisspc
    - typings.gamedig.gamedigStrings.kspdmp
    - typings.gamedig.gamedigStrings.kzmod
    - typings.gamedig.gamedigStrings.left4dead
    - typings.gamedig.gamedigStrings.left4dead2
    - typings.gamedig.gamedigStrings.m2mp
    - typings.gamedig.gamedigStrings.m2o
    - typings.gamedig.gamedigStrings.medievalengineers
    - typings.gamedig.gamedigStrings.mohaa
    - typings.gamedig.gamedigStrings.mohsh
    - typings.gamedig.gamedigStrings.mohbt
    - typings.gamedig.gamedigStrings.mohpa
    - typings.gamedig.gamedigStrings.mohab
    - typings.gamedig.gamedigStrings.moh2010
    - typings.gamedig.gamedigStrings.mohwf
    - typings.gamedig.gamedigStrings.minecraft
    - typings.gamedig.gamedigStrings.minecraftping
    - typings.gamedig.gamedigStrings.minecraftpe
    - typings.gamedig.gamedigStrings.minecraftbe
    - typings.gamedig.gamedigStrings.mnc
    - typings.gamedig.gamedigStrings.mordhau
    - typings.gamedig.gamedigStrings.mtavc
    - typings.gamedig.gamedigStrings.mtasa
    - typings.gamedig.gamedigStrings.mumble
    - typings.gamedig.gamedigStrings.mumbleping
    - typings.gamedig.gamedigStrings.nascarthunder2004
    - typings.gamedig.gamedigStrings.netpanzer
    - typings.gamedig.gamedigStrings.nmrih
    - typings.gamedig.gamedigStrings.ns
    - typings.gamedig.gamedigStrings.ns2
    - typings.gamedig.gamedigStrings.nfshp2
    - typings.gamedig.gamedigStrings.nab
    - typings.gamedig.gamedigStrings.nwn
    - typings.gamedig.gamedigStrings.nwn2
    - typings.gamedig.gamedigStrings.nexuiz
    - typings.gamedig.gamedigStrings.nitrofamily
    - typings.gamedig.gamedigStrings.nolf
    - typings.gamedig.gamedigStrings.nolf2
    - typings.gamedig.gamedigStrings.nucleardawn
    - typings.gamedig.gamedigStrings.openarena
    - typings.gamedig.gamedigStrings.openttd
    - typings.gamedig.gamedigStrings.painkiller
    - typings.gamedig.gamedigStrings.pixark
    - typings.gamedig.gamedigStrings.postal2
    - typings.gamedig.gamedigStrings.prey
    - typings.gamedig.gamedigStrings.primalcarnage
    - typings.gamedig.gamedigStrings.prbf2
    - typings.gamedig.gamedigStrings.quake1
    - typings.gamedig.gamedigStrings.quake2
    - typings.gamedig.gamedigStrings.quake3
    - typings.gamedig.gamedigStrings.quake4
    - typings.gamedig.gamedigStrings.quakelive
    - typings.gamedig.gamedigStrings.ragdollkungfu
    - typings.gamedig.gamedigStrings.r6
    - typings.gamedig.gamedigStrings.r6roguespear
    - typings.gamedig.gamedigStrings.r6ravenshield
    - typings.gamedig.gamedigStrings.rallisportchallenge
    - typings.gamedig.gamedigStrings.rallymasters
    - typings.gamedig.gamedigStrings.redorchestra
    - typings.gamedig.gamedigStrings.redorchestraost
    - typings.gamedig.gamedigStrings.redorchestra2
    - typings.gamedig.gamedigStrings.redline
    - typings.gamedig.gamedigStrings.rtcw
    - typings.gamedig.gamedigStrings.rfactor
    - typings.gamedig.gamedigStrings.ricochet
    - typings.gamedig.gamedigStrings.riseofnations
    - typings.gamedig.gamedigStrings.rs2
    - typings.gamedig.gamedigStrings.rune
    - typings.gamedig.gamedigStrings.rust
    - typings.gamedig.gamedigStrings.samp
    - typings.gamedig.gamedigStrings.spaceengineers
    - typings.gamedig.gamedigStrings.ss
    - typings.gamedig.gamedigStrings.ss2
    - typings.gamedig.gamedigStrings.shatteredhorizon
    - typings.gamedig.gamedigStrings.ship
    - typings.gamedig.gamedigStrings.shogo
    - typings.gamedig.gamedigStrings.shootmania
    - typings.gamedig.gamedigStrings.sin
    - typings.gamedig.gamedigStrings.sinep
    - typings.gamedig.gamedigStrings.soldat
    - typings.gamedig.gamedigStrings.sof
    - typings.gamedig.gamedigStrings.sof2
    - typings.gamedig.gamedigStrings.stalker
    - typings.gamedig.gamedigStrings.stbc
    - typings.gamedig.gamedigStrings.stvef
    - typings.gamedig.gamedigStrings.stvef2
    - typings.gamedig.gamedigStrings.squad
    - typings.gamedig.gamedigStrings.swbf
    - typings.gamedig.gamedigStrings.swbf2
    - typings.gamedig.gamedigStrings.swjk
    - typings.gamedig.gamedigStrings.swjk2
    - typings.gamedig.gamedigStrings.swrc
    - typings.gamedig.gamedigStrings.starbound
    - typings.gamedig.gamedigStrings.starmade
    - typings.gamedig.gamedigStrings.starsiege
    - typings.gamedig.gamedigStrings.suicidesurvival
    - typings.gamedig.gamedigStrings.swat4
    - typings.gamedig.gamedigStrings.svencoop
    - typings.gamedig.gamedigStrings.synergy
    - typings.gamedig.gamedigStrings.tacticalops
    - typings.gamedig.gamedigStrings.takeonhelicopters
    - typings.gamedig.gamedigStrings.teamfactor
    - typings.gamedig.gamedigStrings.tfc
    - typings.gamedig.gamedigStrings.tf2
    - typings.gamedig.gamedigStrings.teamspeak2
    - typings.gamedig.gamedigStrings.teamspeak3
    - typings.gamedig.gamedigStrings.terminus
    - typings.gamedig.gamedigStrings.terraria
    - typings.gamedig.gamedigStrings.tshock
    - typings.gamedig.gamedigStrings.thps3
    - typings.gamedig.gamedigStrings.thps4
    - typings.gamedig.gamedigStrings.thu2
    - typings.gamedig.gamedigStrings.towerunite
    - typings.gamedig.gamedigStrings.trackmania2
    - typings.gamedig.gamedigStrings.trackmaniaforever
    - typings.gamedig.gamedigStrings.tremulous
    - typings.gamedig.gamedigStrings.tribes1
    - typings.gamedig.gamedigStrings.tribesvengeance
    - typings.gamedig.gamedigStrings.tron20
    - typings.gamedig.gamedigStrings.turok2
    - typings.gamedig.gamedigStrings.universalcombat
    - typings.gamedig.gamedigStrings.unreal
    - typings.gamedig.gamedigStrings.unturned
    - typings.gamedig.gamedigStrings.ut
    - typings.gamedig.gamedigStrings.ut2003
    - typings.gamedig.gamedigStrings.ut2004
    - typings.gamedig.gamedigStrings.ut3
    - typings.gamedig.gamedigStrings.urbanterror
    - typings.gamedig.gamedigStrings.v8supercar
    - typings.gamedig.gamedigStrings.vcmp
    - typings.gamedig.gamedigStrings.ventrilo
    - typings.gamedig.gamedigStrings.vietcong
    - typings.gamedig.gamedigStrings.vietcong2
    - typings.gamedig.gamedigStrings.warsow
    - typings.gamedig.gamedigStrings.wheeloftime
    - typings.gamedig.gamedigStrings.wolfenstein2009
    - typings.gamedig.gamedigStrings.wolfensteinet
    - typings.gamedig.gamedigStrings.xpandrally
    - typings.gamedig.gamedigStrings.zombiemaster
    - typings.gamedig.gamedigStrings.zps
  */
  trait Type extends StObject
  object Type {
    
    inline def `7d2d`: typings.gamedig.gamedigStrings.`7d2d` = "7d2d".asInstanceOf[typings.gamedig.gamedigStrings.`7d2d`]
    
    inline def ageofchivalry: typings.gamedig.gamedigStrings.ageofchivalry = "ageofchivalry".asInstanceOf[typings.gamedig.gamedigStrings.ageofchivalry]
    
    inline def alienarena: typings.gamedig.gamedigStrings.alienarena = "alienarena".asInstanceOf[typings.gamedig.gamedigStrings.alienarena]
    
    inline def alienswarm: typings.gamedig.gamedigStrings.alienswarm = "alienswarm".asInstanceOf[typings.gamedig.gamedigStrings.alienswarm]
    
    inline def americasarmy: typings.gamedig.gamedigStrings.americasarmy = "americasarmy".asInstanceOf[typings.gamedig.gamedigStrings.americasarmy]
    
    inline def americasarmy2: typings.gamedig.gamedigStrings.americasarmy2 = "americasarmy2".asInstanceOf[typings.gamedig.gamedigStrings.americasarmy2]
    
    inline def americasarmy3: typings.gamedig.gamedigStrings.americasarmy3 = "americasarmy3".asInstanceOf[typings.gamedig.gamedigStrings.americasarmy3]
    
    inline def americasarmypg: typings.gamedig.gamedigStrings.americasarmypg = "americasarmypg".asInstanceOf[typings.gamedig.gamedigStrings.americasarmypg]
    
    inline def aoe2: typings.gamedig.gamedigStrings.aoe2 = "aoe2".asInstanceOf[typings.gamedig.gamedigStrings.aoe2]
    
    inline def arcasimracing: typings.gamedig.gamedigStrings.arcasimracing = "arcasimracing".asInstanceOf[typings.gamedig.gamedigStrings.arcasimracing]
    
    inline def arkse: typings.gamedig.gamedigStrings.arkse = "arkse".asInstanceOf[typings.gamedig.gamedigStrings.arkse]
    
    inline def arma: typings.gamedig.gamedigStrings.arma = "arma".asInstanceOf[typings.gamedig.gamedigStrings.arma]
    
    inline def arma2: typings.gamedig.gamedigStrings.arma2 = "arma2".asInstanceOf[typings.gamedig.gamedigStrings.arma2]
    
    inline def arma2oa: typings.gamedig.gamedigStrings.arma2oa = "arma2oa".asInstanceOf[typings.gamedig.gamedigStrings.arma2oa]
    
    inline def arma3: typings.gamedig.gamedigStrings.arma3 = "arma3".asInstanceOf[typings.gamedig.gamedigStrings.arma3]
    
    inline def armacwa: typings.gamedig.gamedigStrings.armacwa = "armacwa".asInstanceOf[typings.gamedig.gamedigStrings.armacwa]
    
    inline def armagetron: typings.gamedig.gamedigStrings.armagetron = "armagetron".asInstanceOf[typings.gamedig.gamedigStrings.armagetron]
    
    inline def armar: typings.gamedig.gamedigStrings.armar = "armar".asInstanceOf[typings.gamedig.gamedigStrings.armar]
    
    inline def assettocorsa: typings.gamedig.gamedigStrings.assettocorsa = "assettocorsa".asInstanceOf[typings.gamedig.gamedigStrings.assettocorsa]
    
    inline def atlas: typings.gamedig.gamedigStrings.atlas = "atlas".asInstanceOf[typings.gamedig.gamedigStrings.atlas]
    
    inline def avp2: typings.gamedig.gamedigStrings.avp2 = "avp2".asInstanceOf[typings.gamedig.gamedigStrings.avp2]
    
    inline def avp2010: typings.gamedig.gamedigStrings.avp2010 = "avp2010".asInstanceOf[typings.gamedig.gamedigStrings.avp2010]
    
    inline def baldursgate: typings.gamedig.gamedigStrings.baldursgate = "baldursgate".asInstanceOf[typings.gamedig.gamedigStrings.baldursgate]
    
    inline def bat1944: typings.gamedig.gamedigStrings.bat1944 = "bat1944".asInstanceOf[typings.gamedig.gamedigStrings.bat1944]
    
    inline def bf1942: typings.gamedig.gamedigStrings.bf1942 = "bf1942".asInstanceOf[typings.gamedig.gamedigStrings.bf1942]
    
    inline def bf2: typings.gamedig.gamedigStrings.bf2 = "bf2".asInstanceOf[typings.gamedig.gamedigStrings.bf2]
    
    inline def bf2142: typings.gamedig.gamedigStrings.bf2142 = "bf2142".asInstanceOf[typings.gamedig.gamedigStrings.bf2142]
    
    inline def bf3: typings.gamedig.gamedigStrings.bf3 = "bf3".asInstanceOf[typings.gamedig.gamedigStrings.bf3]
    
    inline def bf4: typings.gamedig.gamedigStrings.bf4 = "bf4".asInstanceOf[typings.gamedig.gamedigStrings.bf4]
    
    inline def bfbc2: typings.gamedig.gamedigStrings.bfbc2 = "bfbc2".asInstanceOf[typings.gamedig.gamedigStrings.bfbc2]
    
    inline def bfh: typings.gamedig.gamedigStrings.bfh = "bfh".asInstanceOf[typings.gamedig.gamedigStrings.bfh]
    
    inline def bfv: typings.gamedig.gamedigStrings.bfv = "bfv".asInstanceOf[typings.gamedig.gamedigStrings.bfv]
    
    inline def breach: typings.gamedig.gamedigStrings.breach = "breach".asInstanceOf[typings.gamedig.gamedigStrings.breach]
    
    inline def breed: typings.gamedig.gamedigStrings.breed = "breed".asInstanceOf[typings.gamedig.gamedigStrings.breed]
    
    inline def brink: typings.gamedig.gamedigStrings.brink = "brink".asInstanceOf[typings.gamedig.gamedigStrings.brink]
    
    inline def buildandshoot: typings.gamedig.gamedigStrings.buildandshoot = "buildandshoot".asInstanceOf[typings.gamedig.gamedigStrings.buildandshoot]
    
    inline def cacrenegade: typings.gamedig.gamedigStrings.cacrenegade = "cacrenegade".asInstanceOf[typings.gamedig.gamedigStrings.cacrenegade]
    
    inline def callofjuarez: typings.gamedig.gamedigStrings.callofjuarez = "callofjuarez".asInstanceOf[typings.gamedig.gamedigStrings.callofjuarez]
    
    inline def chaser: typings.gamedig.gamedigStrings.chaser = "chaser".asInstanceOf[typings.gamedig.gamedigStrings.chaser]
    
    inline def chrome: typings.gamedig.gamedigStrings.chrome = "chrome".asInstanceOf[typings.gamedig.gamedigStrings.chrome]
    
    inline def cod: typings.gamedig.gamedigStrings.cod = "cod".asInstanceOf[typings.gamedig.gamedigStrings.cod]
    
    inline def cod2: typings.gamedig.gamedigStrings.cod2 = "cod2".asInstanceOf[typings.gamedig.gamedigStrings.cod2]
    
    inline def cod3: typings.gamedig.gamedigStrings.cod3 = "cod3".asInstanceOf[typings.gamedig.gamedigStrings.cod3]
    
    inline def cod4: typings.gamedig.gamedigStrings.cod4 = "cod4".asInstanceOf[typings.gamedig.gamedigStrings.cod4]
    
    inline def codenameeagle: typings.gamedig.gamedigStrings.codenameeagle = "codenameeagle".asInstanceOf[typings.gamedig.gamedigStrings.codenameeagle]
    
    inline def codmw2: typings.gamedig.gamedigStrings.codmw2 = "codmw2".asInstanceOf[typings.gamedig.gamedigStrings.codmw2]
    
    inline def codmw3: typings.gamedig.gamedigStrings.codmw3 = "codmw3".asInstanceOf[typings.gamedig.gamedigStrings.codmw3]
    
    inline def coduo: typings.gamedig.gamedigStrings.coduo = "coduo".asInstanceOf[typings.gamedig.gamedigStrings.coduo]
    
    inline def codwaw: typings.gamedig.gamedigStrings.codwaw = "codwaw".asInstanceOf[typings.gamedig.gamedigStrings.codwaw]
    
    inline def commandos3: typings.gamedig.gamedigStrings.commandos3 = "commandos3".asInstanceOf[typings.gamedig.gamedigStrings.commandos3]
    
    inline def conanexiles: typings.gamedig.gamedigStrings.conanexiles = "conanexiles".asInstanceOf[typings.gamedig.gamedigStrings.conanexiles]
    
    inline def contactjack: typings.gamedig.gamedigStrings.contactjack = "contactjack".asInstanceOf[typings.gamedig.gamedigStrings.contactjack]
    
    inline def contagion: typings.gamedig.gamedigStrings.contagion = "contagion".asInstanceOf[typings.gamedig.gamedigStrings.contagion]
    
    inline def crossracing: typings.gamedig.gamedigStrings.crossracing = "crossracing".asInstanceOf[typings.gamedig.gamedigStrings.crossracing]
    
    inline def crysis: typings.gamedig.gamedigStrings.crysis = "crysis".asInstanceOf[typings.gamedig.gamedigStrings.crysis]
    
    inline def crysis2: typings.gamedig.gamedigStrings.crysis2 = "crysis2".asInstanceOf[typings.gamedig.gamedigStrings.crysis2]
    
    inline def crysiswars: typings.gamedig.gamedigStrings.crysiswars = "crysiswars".asInstanceOf[typings.gamedig.gamedigStrings.crysiswars]
    
    inline def cs15: typings.gamedig.gamedigStrings.cs15 = "cs15".asInstanceOf[typings.gamedig.gamedigStrings.cs15]
    
    inline def cs16: typings.gamedig.gamedigStrings.cs16 = "cs16".asInstanceOf[typings.gamedig.gamedigStrings.cs16]
    
    inline def cs2d: typings.gamedig.gamedigStrings.cs2d = "cs2d".asInstanceOf[typings.gamedig.gamedigStrings.cs2d]
    
    inline def cscz: typings.gamedig.gamedigStrings.cscz = "cscz".asInstanceOf[typings.gamedig.gamedigStrings.cscz]
    
    inline def csgo: typings.gamedig.gamedigStrings.csgo = "csgo".asInstanceOf[typings.gamedig.gamedigStrings.csgo]
    
    inline def css: typings.gamedig.gamedigStrings.css = "css".asInstanceOf[typings.gamedig.gamedigStrings.css]
    
    inline def daikatana: typings.gamedig.gamedigStrings.daikatana = "daikatana".asInstanceOf[typings.gamedig.gamedigStrings.daikatana]
    
    inline def darkesthour: typings.gamedig.gamedigStrings.darkesthour = "darkesthour".asInstanceOf[typings.gamedig.gamedigStrings.darkesthour]
    
    inline def daysofwar: typings.gamedig.gamedigStrings.daysofwar = "daysofwar".asInstanceOf[typings.gamedig.gamedigStrings.daysofwar]
    
    inline def dayz: typings.gamedig.gamedigStrings.dayz = "dayz".asInstanceOf[typings.gamedig.gamedigStrings.dayz]
    
    inline def dayzmod: typings.gamedig.gamedigStrings.dayzmod = "dayzmod".asInstanceOf[typings.gamedig.gamedigStrings.dayzmod]
    
    inline def deadlydozenpt: typings.gamedig.gamedigStrings.deadlydozenpt = "deadlydozenpt".asInstanceOf[typings.gamedig.gamedigStrings.deadlydozenpt]
    
    inline def descent3: typings.gamedig.gamedigStrings.descent3 = "descent3".asInstanceOf[typings.gamedig.gamedigStrings.descent3]
    
    inline def deusex: typings.gamedig.gamedigStrings.deusex = "deusex".asInstanceOf[typings.gamedig.gamedigStrings.deusex]
    
    inline def devastation: typings.gamedig.gamedigStrings.devastation = "devastation".asInstanceOf[typings.gamedig.gamedigStrings.devastation]
    
    inline def dh2005: typings.gamedig.gamedigStrings.dh2005 = "dh2005".asInstanceOf[typings.gamedig.gamedigStrings.dh2005]
    
    inline def dinodday: typings.gamedig.gamedigStrings.dinodday = "dinodday".asInstanceOf[typings.gamedig.gamedigStrings.dinodday]
    
    inline def dirttrackracing2: typings.gamedig.gamedigStrings.dirttrackracing2 = "dirttrackracing2".asInstanceOf[typings.gamedig.gamedigStrings.dirttrackracing2]
    
    inline def dmomam: typings.gamedig.gamedigStrings.dmomam = "dmomam".asInstanceOf[typings.gamedig.gamedigStrings.dmomam]
    
    inline def dnl: typings.gamedig.gamedigStrings.dnl = "dnl".asInstanceOf[typings.gamedig.gamedigStrings.dnl]
    
    inline def dod: typings.gamedig.gamedigStrings.dod = "dod".asInstanceOf[typings.gamedig.gamedigStrings.dod]
    
    inline def dods: typings.gamedig.gamedigStrings.dods = "dods".asInstanceOf[typings.gamedig.gamedigStrings.dods]
    
    inline def doi: typings.gamedig.gamedigStrings.doi = "doi".asInstanceOf[typings.gamedig.gamedigStrings.doi]
    
    inline def doom3: typings.gamedig.gamedigStrings.doom3 = "doom3".asInstanceOf[typings.gamedig.gamedigStrings.doom3]
    
    inline def dota2: typings.gamedig.gamedigStrings.dota2 = "dota2".asInstanceOf[typings.gamedig.gamedigStrings.dota2]
    
    inline def drakan: typings.gamedig.gamedigStrings.drakan = "drakan".asInstanceOf[typings.gamedig.gamedigStrings.drakan]
    
    inline def empyrion: typings.gamedig.gamedigStrings.empyrion = "empyrion".asInstanceOf[typings.gamedig.gamedigStrings.empyrion]
    
    inline def etqw: typings.gamedig.gamedigStrings.etqw = "etqw".asInstanceOf[typings.gamedig.gamedigStrings.etqw]
    
    inline def f12002: typings.gamedig.gamedigStrings.f12002 = "f12002".asInstanceOf[typings.gamedig.gamedigStrings.f12002]
    
    inline def f1c9902: typings.gamedig.gamedigStrings.f1c9902 = "f1c9902".asInstanceOf[typings.gamedig.gamedigStrings.f1c9902]
    
    inline def farcry: typings.gamedig.gamedigStrings.farcry = "farcry".asInstanceOf[typings.gamedig.gamedigStrings.farcry]
    
    inline def farcry2: typings.gamedig.gamedigStrings.farcry2 = "farcry2".asInstanceOf[typings.gamedig.gamedigStrings.farcry2]
    
    inline def fear: typings.gamedig.gamedigStrings.fear = "fear".asInstanceOf[typings.gamedig.gamedigStrings.fear]
    
    inline def ffow: typings.gamedig.gamedigStrings.ffow = "ffow".asInstanceOf[typings.gamedig.gamedigStrings.ffow]
    
    inline def fivem: typings.gamedig.gamedigStrings.fivem = "fivem".asInstanceOf[typings.gamedig.gamedigStrings.fivem]
    
    inline def flashpoint: typings.gamedig.gamedigStrings.flashpoint = "flashpoint".asInstanceOf[typings.gamedig.gamedigStrings.flashpoint]
    
    inline def flashpointresistance: typings.gamedig.gamedigStrings.flashpointresistance = "flashpointresistance".asInstanceOf[typings.gamedig.gamedigStrings.flashpointresistance]
    
    inline def forrest: typings.gamedig.gamedigStrings.forrest = "forrest".asInstanceOf[typings.gamedig.gamedigStrings.forrest]
    
    inline def fortressforever: typings.gamedig.gamedigStrings.fortressforever = "fortressforever".asInstanceOf[typings.gamedig.gamedigStrings.fortressforever]
    
    inline def garrysmod: typings.gamedig.gamedigStrings.garrysmod = "garrysmod".asInstanceOf[typings.gamedig.gamedigStrings.garrysmod]
    
    inline def geneshift: typings.gamedig.gamedigStrings.geneshift = "geneshift".asInstanceOf[typings.gamedig.gamedigStrings.geneshift]
    
    inline def ges: typings.gamedig.gamedigStrings.ges = "ges".asInstanceOf[typings.gamedig.gamedigStrings.ges]
    
    inline def giantscitizenkabuto: typings.gamedig.gamedigStrings.giantscitizenkabuto = "giantscitizenkabuto".asInstanceOf[typings.gamedig.gamedigStrings.giantscitizenkabuto]
    
    inline def globaloperations: typings.gamedig.gamedigStrings.globaloperations = "globaloperations".asInstanceOf[typings.gamedig.gamedigStrings.globaloperations]
    
    inline def gore: typings.gamedig.gamedigStrings.gore = "gore".asInstanceOf[typings.gamedig.gamedigStrings.gore]
    
    inline def graw: typings.gamedig.gamedigStrings.graw = "graw".asInstanceOf[typings.gamedig.gamedigStrings.graw]
    
    inline def graw2: typings.gamedig.gamedigStrings.graw2 = "graw2".asInstanceOf[typings.gamedig.gamedigStrings.graw2]
    
    inline def gunmanchronicles: typings.gamedig.gamedigStrings.gunmanchronicles = "gunmanchronicles".asInstanceOf[typings.gamedig.gamedigStrings.gunmanchronicles]
    
    inline def had2: typings.gamedig.gamedigStrings.had2 = "had2".asInstanceOf[typings.gamedig.gamedigStrings.had2]
    
    inline def halo: typings.gamedig.gamedigStrings.halo = "halo".asInstanceOf[typings.gamedig.gamedigStrings.halo]
    
    inline def halo2: typings.gamedig.gamedigStrings.halo2 = "halo2".asInstanceOf[typings.gamedig.gamedigStrings.halo2]
    
    inline def heretic2: typings.gamedig.gamedigStrings.heretic2 = "heretic2".asInstanceOf[typings.gamedig.gamedigStrings.heretic2]
    
    inline def hexen2: typings.gamedig.gamedigStrings.hexen2 = "hexen2".asInstanceOf[typings.gamedig.gamedigStrings.hexen2]
    
    inline def hidden: typings.gamedig.gamedigStrings.hidden = "hidden".asInstanceOf[typings.gamedig.gamedigStrings.hidden]
    
    inline def hl2dm: typings.gamedig.gamedigStrings.hl2dm = "hl2dm".asInstanceOf[typings.gamedig.gamedigStrings.hl2dm]
    
    inline def hldm: typings.gamedig.gamedigStrings.hldm = "hldm".asInstanceOf[typings.gamedig.gamedigStrings.hldm]
    
    inline def hldms: typings.gamedig.gamedigStrings.hldms = "hldms".asInstanceOf[typings.gamedig.gamedigStrings.hldms]
    
    inline def hll: typings.gamedig.gamedigStrings.hll = "hll".asInstanceOf[typings.gamedig.gamedigStrings.hll]
    
    inline def homefront: typings.gamedig.gamedigStrings.homefront = "homefront".asInstanceOf[typings.gamedig.gamedigStrings.homefront]
    
    inline def homeworld2: typings.gamedig.gamedigStrings.homeworld2 = "homeworld2".asInstanceOf[typings.gamedig.gamedigStrings.homeworld2]
    
    inline def hurtworld: typings.gamedig.gamedigStrings.hurtworld = "hurtworld".asInstanceOf[typings.gamedig.gamedigStrings.hurtworld]
    
    inline def igi2: typings.gamedig.gamedigStrings.igi2 = "igi2".asInstanceOf[typings.gamedig.gamedigStrings.igi2]
    
    inline def il2: typings.gamedig.gamedigStrings.il2 = "il2".asInstanceOf[typings.gamedig.gamedigStrings.il2]
    
    inline def insurgency: typings.gamedig.gamedigStrings.insurgency = "insurgency".asInstanceOf[typings.gamedig.gamedigStrings.insurgency]
    
    inline def insurgencysandstorm: typings.gamedig.gamedigStrings.insurgencysandstorm = "insurgencysandstorm".asInstanceOf[typings.gamedig.gamedigStrings.insurgencysandstorm]
    
    inline def ironstorm: typings.gamedig.gamedigStrings.ironstorm = "ironstorm".asInstanceOf[typings.gamedig.gamedigStrings.ironstorm]
    
    inline def jamesbondnightfire: typings.gamedig.gamedigStrings.jamesbondnightfire = "jamesbondnightfire".asInstanceOf[typings.gamedig.gamedigStrings.jamesbondnightfire]
    
    inline def jc2mp: typings.gamedig.gamedigStrings.jc2mp = "jc2mp".asInstanceOf[typings.gamedig.gamedigStrings.jc2mp]
    
    inline def jc3mp: typings.gamedig.gamedigStrings.jc3mp = "jc3mp".asInstanceOf[typings.gamedig.gamedigStrings.jc3mp]
    
    inline def killingfloor: typings.gamedig.gamedigStrings.killingfloor = "killingfloor".asInstanceOf[typings.gamedig.gamedigStrings.killingfloor]
    
    inline def killingfloor2: typings.gamedig.gamedigStrings.killingfloor2 = "killingfloor2".asInstanceOf[typings.gamedig.gamedigStrings.killingfloor2]
    
    inline def kingpin: typings.gamedig.gamedigStrings.kingpin = "kingpin".asInstanceOf[typings.gamedig.gamedigStrings.kingpin]
    
    inline def kisspc: typings.gamedig.gamedigStrings.kisspc = "kisspc".asInstanceOf[typings.gamedig.gamedigStrings.kisspc]
    
    inline def kspdmp: typings.gamedig.gamedigStrings.kspdmp = "kspdmp".asInstanceOf[typings.gamedig.gamedigStrings.kspdmp]
    
    inline def kzmod: typings.gamedig.gamedigStrings.kzmod = "kzmod".asInstanceOf[typings.gamedig.gamedigStrings.kzmod]
    
    inline def left4dead: typings.gamedig.gamedigStrings.left4dead = "left4dead".asInstanceOf[typings.gamedig.gamedigStrings.left4dead]
    
    inline def left4dead2: typings.gamedig.gamedigStrings.left4dead2 = "left4dead2".asInstanceOf[typings.gamedig.gamedigStrings.left4dead2]
    
    inline def m2mp: typings.gamedig.gamedigStrings.m2mp = "m2mp".asInstanceOf[typings.gamedig.gamedigStrings.m2mp]
    
    inline def m2o: typings.gamedig.gamedigStrings.m2o = "m2o".asInstanceOf[typings.gamedig.gamedigStrings.m2o]
    
    inline def medievalengineers: typings.gamedig.gamedigStrings.medievalengineers = "medievalengineers".asInstanceOf[typings.gamedig.gamedigStrings.medievalengineers]
    
    inline def minecraft: typings.gamedig.gamedigStrings.minecraft = "minecraft".asInstanceOf[typings.gamedig.gamedigStrings.minecraft]
    
    inline def minecraftbe: typings.gamedig.gamedigStrings.minecraftbe = "minecraftbe".asInstanceOf[typings.gamedig.gamedigStrings.minecraftbe]
    
    inline def minecraftpe: typings.gamedig.gamedigStrings.minecraftpe = "minecraftpe".asInstanceOf[typings.gamedig.gamedigStrings.minecraftpe]
    
    inline def minecraftping: typings.gamedig.gamedigStrings.minecraftping = "minecraftping".asInstanceOf[typings.gamedig.gamedigStrings.minecraftping]
    
    inline def mnc: typings.gamedig.gamedigStrings.mnc = "mnc".asInstanceOf[typings.gamedig.gamedigStrings.mnc]
    
    inline def moh2010: typings.gamedig.gamedigStrings.moh2010 = "moh2010".asInstanceOf[typings.gamedig.gamedigStrings.moh2010]
    
    inline def mohaa: typings.gamedig.gamedigStrings.mohaa = "mohaa".asInstanceOf[typings.gamedig.gamedigStrings.mohaa]
    
    inline def mohab: typings.gamedig.gamedigStrings.mohab = "mohab".asInstanceOf[typings.gamedig.gamedigStrings.mohab]
    
    inline def mohbt: typings.gamedig.gamedigStrings.mohbt = "mohbt".asInstanceOf[typings.gamedig.gamedigStrings.mohbt]
    
    inline def mohpa: typings.gamedig.gamedigStrings.mohpa = "mohpa".asInstanceOf[typings.gamedig.gamedigStrings.mohpa]
    
    inline def mohsh: typings.gamedig.gamedigStrings.mohsh = "mohsh".asInstanceOf[typings.gamedig.gamedigStrings.mohsh]
    
    inline def mohwf: typings.gamedig.gamedigStrings.mohwf = "mohwf".asInstanceOf[typings.gamedig.gamedigStrings.mohwf]
    
    inline def mordhau: typings.gamedig.gamedigStrings.mordhau = "mordhau".asInstanceOf[typings.gamedig.gamedigStrings.mordhau]
    
    inline def mtasa: typings.gamedig.gamedigStrings.mtasa = "mtasa".asInstanceOf[typings.gamedig.gamedigStrings.mtasa]
    
    inline def mtavc: typings.gamedig.gamedigStrings.mtavc = "mtavc".asInstanceOf[typings.gamedig.gamedigStrings.mtavc]
    
    inline def mumble: typings.gamedig.gamedigStrings.mumble = "mumble".asInstanceOf[typings.gamedig.gamedigStrings.mumble]
    
    inline def mumbleping: typings.gamedig.gamedigStrings.mumbleping = "mumbleping".asInstanceOf[typings.gamedig.gamedigStrings.mumbleping]
    
    inline def mutantfactions: typings.gamedig.gamedigStrings.mutantfactions = "mutantfactions".asInstanceOf[typings.gamedig.gamedigStrings.mutantfactions]
    
    inline def nab: typings.gamedig.gamedigStrings.nab = "nab".asInstanceOf[typings.gamedig.gamedigStrings.nab]
    
    inline def nascarthunder2004: typings.gamedig.gamedigStrings.nascarthunder2004 = "nascarthunder2004".asInstanceOf[typings.gamedig.gamedigStrings.nascarthunder2004]
    
    inline def netpanzer: typings.gamedig.gamedigStrings.netpanzer = "netpanzer".asInstanceOf[typings.gamedig.gamedigStrings.netpanzer]
    
    inline def nexuiz: typings.gamedig.gamedigStrings.nexuiz = "nexuiz".asInstanceOf[typings.gamedig.gamedigStrings.nexuiz]
    
    inline def nfshp2: typings.gamedig.gamedigStrings.nfshp2 = "nfshp2".asInstanceOf[typings.gamedig.gamedigStrings.nfshp2]
    
    inline def nitrofamily: typings.gamedig.gamedigStrings.nitrofamily = "nitrofamily".asInstanceOf[typings.gamedig.gamedigStrings.nitrofamily]
    
    inline def nmrih: typings.gamedig.gamedigStrings.nmrih = "nmrih".asInstanceOf[typings.gamedig.gamedigStrings.nmrih]
    
    inline def nolf: typings.gamedig.gamedigStrings.nolf = "nolf".asInstanceOf[typings.gamedig.gamedigStrings.nolf]
    
    inline def nolf2: typings.gamedig.gamedigStrings.nolf2 = "nolf2".asInstanceOf[typings.gamedig.gamedigStrings.nolf2]
    
    inline def ns: typings.gamedig.gamedigStrings.ns = "ns".asInstanceOf[typings.gamedig.gamedigStrings.ns]
    
    inline def ns2: typings.gamedig.gamedigStrings.ns2 = "ns2".asInstanceOf[typings.gamedig.gamedigStrings.ns2]
    
    inline def nucleardawn: typings.gamedig.gamedigStrings.nucleardawn = "nucleardawn".asInstanceOf[typings.gamedig.gamedigStrings.nucleardawn]
    
    inline def nwn: typings.gamedig.gamedigStrings.nwn = "nwn".asInstanceOf[typings.gamedig.gamedigStrings.nwn]
    
    inline def nwn2: typings.gamedig.gamedigStrings.nwn2 = "nwn2".asInstanceOf[typings.gamedig.gamedigStrings.nwn2]
    
    inline def openarena: typings.gamedig.gamedigStrings.openarena = "openarena".asInstanceOf[typings.gamedig.gamedigStrings.openarena]
    
    inline def openttd: typings.gamedig.gamedigStrings.openttd = "openttd".asInstanceOf[typings.gamedig.gamedigStrings.openttd]
    
    inline def operationflashpoint: typings.gamedig.gamedigStrings.operationflashpoint = "operationflashpoint".asInstanceOf[typings.gamedig.gamedigStrings.operationflashpoint]
    
    inline def painkiller: typings.gamedig.gamedigStrings.painkiller = "painkiller".asInstanceOf[typings.gamedig.gamedigStrings.painkiller]
    
    inline def pixark: typings.gamedig.gamedigStrings.pixark = "pixark".asInstanceOf[typings.gamedig.gamedigStrings.pixark]
    
    inline def postal2: typings.gamedig.gamedigStrings.postal2 = "postal2".asInstanceOf[typings.gamedig.gamedigStrings.postal2]
    
    inline def prbf2: typings.gamedig.gamedigStrings.prbf2 = "prbf2".asInstanceOf[typings.gamedig.gamedigStrings.prbf2]
    
    inline def prey: typings.gamedig.gamedigStrings.prey = "prey".asInstanceOf[typings.gamedig.gamedigStrings.prey]
    
    inline def primalcarnage: typings.gamedig.gamedigStrings.primalcarnage = "primalcarnage".asInstanceOf[typings.gamedig.gamedigStrings.primalcarnage]
    
    inline def quake1: typings.gamedig.gamedigStrings.quake1 = "quake1".asInstanceOf[typings.gamedig.gamedigStrings.quake1]
    
    inline def quake2: typings.gamedig.gamedigStrings.quake2 = "quake2".asInstanceOf[typings.gamedig.gamedigStrings.quake2]
    
    inline def quake3: typings.gamedig.gamedigStrings.quake3 = "quake3".asInstanceOf[typings.gamedig.gamedigStrings.quake3]
    
    inline def quake4: typings.gamedig.gamedigStrings.quake4 = "quake4".asInstanceOf[typings.gamedig.gamedigStrings.quake4]
    
    inline def quakelive: typings.gamedig.gamedigStrings.quakelive = "quakelive".asInstanceOf[typings.gamedig.gamedigStrings.quakelive]
    
    inline def r6: typings.gamedig.gamedigStrings.r6 = "r6".asInstanceOf[typings.gamedig.gamedigStrings.r6]
    
    inline def r6ravenshield: typings.gamedig.gamedigStrings.r6ravenshield = "r6ravenshield".asInstanceOf[typings.gamedig.gamedigStrings.r6ravenshield]
    
    inline def r6roguespear: typings.gamedig.gamedigStrings.r6roguespear = "r6roguespear".asInstanceOf[typings.gamedig.gamedigStrings.r6roguespear]
    
    inline def ragdollkungfu: typings.gamedig.gamedigStrings.ragdollkungfu = "ragdollkungfu".asInstanceOf[typings.gamedig.gamedigStrings.ragdollkungfu]
    
    inline def rallisportchallenge: typings.gamedig.gamedigStrings.rallisportchallenge = "rallisportchallenge".asInstanceOf[typings.gamedig.gamedigStrings.rallisportchallenge]
    
    inline def rallymasters: typings.gamedig.gamedigStrings.rallymasters = "rallymasters".asInstanceOf[typings.gamedig.gamedigStrings.rallymasters]
    
    inline def redline: typings.gamedig.gamedigStrings.redline = "redline".asInstanceOf[typings.gamedig.gamedigStrings.redline]
    
    inline def redorchestra: typings.gamedig.gamedigStrings.redorchestra = "redorchestra".asInstanceOf[typings.gamedig.gamedigStrings.redorchestra]
    
    inline def redorchestra2: typings.gamedig.gamedigStrings.redorchestra2 = "redorchestra2".asInstanceOf[typings.gamedig.gamedigStrings.redorchestra2]
    
    inline def redorchestraost: typings.gamedig.gamedigStrings.redorchestraost = "redorchestraost".asInstanceOf[typings.gamedig.gamedigStrings.redorchestraost]
    
    inline def rfactor: typings.gamedig.gamedigStrings.rfactor = "rfactor".asInstanceOf[typings.gamedig.gamedigStrings.rfactor]
    
    inline def ricochet: typings.gamedig.gamedigStrings.ricochet = "ricochet".asInstanceOf[typings.gamedig.gamedigStrings.ricochet]
    
    inline def riseofnations: typings.gamedig.gamedigStrings.riseofnations = "riseofnations".asInstanceOf[typings.gamedig.gamedigStrings.riseofnations]
    
    inline def rs2: typings.gamedig.gamedigStrings.rs2 = "rs2".asInstanceOf[typings.gamedig.gamedigStrings.rs2]
    
    inline def rtcw: typings.gamedig.gamedigStrings.rtcw = "rtcw".asInstanceOf[typings.gamedig.gamedigStrings.rtcw]
    
    inline def rune: typings.gamedig.gamedigStrings.rune = "rune".asInstanceOf[typings.gamedig.gamedigStrings.rune]
    
    inline def rust: typings.gamedig.gamedigStrings.rust = "rust".asInstanceOf[typings.gamedig.gamedigStrings.rust]
    
    inline def samp: typings.gamedig.gamedigStrings.samp = "samp".asInstanceOf[typings.gamedig.gamedigStrings.samp]
    
    inline def shatteredhorizon: typings.gamedig.gamedigStrings.shatteredhorizon = "shatteredhorizon".asInstanceOf[typings.gamedig.gamedigStrings.shatteredhorizon]
    
    inline def ship: typings.gamedig.gamedigStrings.ship = "ship".asInstanceOf[typings.gamedig.gamedigStrings.ship]
    
    inline def shogo: typings.gamedig.gamedigStrings.shogo = "shogo".asInstanceOf[typings.gamedig.gamedigStrings.shogo]
    
    inline def shootmania: typings.gamedig.gamedigStrings.shootmania = "shootmania".asInstanceOf[typings.gamedig.gamedigStrings.shootmania]
    
    inline def sin: typings.gamedig.gamedigStrings.sin = "sin".asInstanceOf[typings.gamedig.gamedigStrings.sin]
    
    inline def sinep: typings.gamedig.gamedigStrings.sinep = "sinep".asInstanceOf[typings.gamedig.gamedigStrings.sinep]
    
    inline def sof: typings.gamedig.gamedigStrings.sof = "sof".asInstanceOf[typings.gamedig.gamedigStrings.sof]
    
    inline def sof2: typings.gamedig.gamedigStrings.sof2 = "sof2".asInstanceOf[typings.gamedig.gamedigStrings.sof2]
    
    inline def soldat: typings.gamedig.gamedigStrings.soldat = "soldat".asInstanceOf[typings.gamedig.gamedigStrings.soldat]
    
    inline def spaceengineers: typings.gamedig.gamedigStrings.spaceengineers = "spaceengineers".asInstanceOf[typings.gamedig.gamedigStrings.spaceengineers]
    
    inline def squad: typings.gamedig.gamedigStrings.squad = "squad".asInstanceOf[typings.gamedig.gamedigStrings.squad]
    
    inline def ss: typings.gamedig.gamedigStrings.ss = "ss".asInstanceOf[typings.gamedig.gamedigStrings.ss]
    
    inline def ss2: typings.gamedig.gamedigStrings.ss2 = "ss2".asInstanceOf[typings.gamedig.gamedigStrings.ss2]
    
    inline def stalker: typings.gamedig.gamedigStrings.stalker = "stalker".asInstanceOf[typings.gamedig.gamedigStrings.stalker]
    
    inline def starbound: typings.gamedig.gamedigStrings.starbound = "starbound".asInstanceOf[typings.gamedig.gamedigStrings.starbound]
    
    inline def starmade: typings.gamedig.gamedigStrings.starmade = "starmade".asInstanceOf[typings.gamedig.gamedigStrings.starmade]
    
    inline def starsiege: typings.gamedig.gamedigStrings.starsiege = "starsiege".asInstanceOf[typings.gamedig.gamedigStrings.starsiege]
    
    inline def stbc: typings.gamedig.gamedigStrings.stbc = "stbc".asInstanceOf[typings.gamedig.gamedigStrings.stbc]
    
    inline def stvef: typings.gamedig.gamedigStrings.stvef = "stvef".asInstanceOf[typings.gamedig.gamedigStrings.stvef]
    
    inline def stvef2: typings.gamedig.gamedigStrings.stvef2 = "stvef2".asInstanceOf[typings.gamedig.gamedigStrings.stvef2]
    
    inline def suicidesurvival: typings.gamedig.gamedigStrings.suicidesurvival = "suicidesurvival".asInstanceOf[typings.gamedig.gamedigStrings.suicidesurvival]
    
    inline def svencoop: typings.gamedig.gamedigStrings.svencoop = "svencoop".asInstanceOf[typings.gamedig.gamedigStrings.svencoop]
    
    inline def swat4: typings.gamedig.gamedigStrings.swat4 = "swat4".asInstanceOf[typings.gamedig.gamedigStrings.swat4]
    
    inline def swbf: typings.gamedig.gamedigStrings.swbf = "swbf".asInstanceOf[typings.gamedig.gamedigStrings.swbf]
    
    inline def swbf2: typings.gamedig.gamedigStrings.swbf2 = "swbf2".asInstanceOf[typings.gamedig.gamedigStrings.swbf2]
    
    inline def swjk: typings.gamedig.gamedigStrings.swjk = "swjk".asInstanceOf[typings.gamedig.gamedigStrings.swjk]
    
    inline def swjk2: typings.gamedig.gamedigStrings.swjk2 = "swjk2".asInstanceOf[typings.gamedig.gamedigStrings.swjk2]
    
    inline def swrc: typings.gamedig.gamedigStrings.swrc = "swrc".asInstanceOf[typings.gamedig.gamedigStrings.swrc]
    
    inline def synergy: typings.gamedig.gamedigStrings.synergy = "synergy".asInstanceOf[typings.gamedig.gamedigStrings.synergy]
    
    inline def tacticalops: typings.gamedig.gamedigStrings.tacticalops = "tacticalops".asInstanceOf[typings.gamedig.gamedigStrings.tacticalops]
    
    inline def takeonhelicopters: typings.gamedig.gamedigStrings.takeonhelicopters = "takeonhelicopters".asInstanceOf[typings.gamedig.gamedigStrings.takeonhelicopters]
    
    inline def teamfactor: typings.gamedig.gamedigStrings.teamfactor = "teamfactor".asInstanceOf[typings.gamedig.gamedigStrings.teamfactor]
    
    inline def teamspeak2: typings.gamedig.gamedigStrings.teamspeak2 = "teamspeak2".asInstanceOf[typings.gamedig.gamedigStrings.teamspeak2]
    
    inline def teamspeak3: typings.gamedig.gamedigStrings.teamspeak3 = "teamspeak3".asInstanceOf[typings.gamedig.gamedigStrings.teamspeak3]
    
    inline def terminus: typings.gamedig.gamedigStrings.terminus = "terminus".asInstanceOf[typings.gamedig.gamedigStrings.terminus]
    
    inline def terraria: typings.gamedig.gamedigStrings.terraria = "terraria".asInstanceOf[typings.gamedig.gamedigStrings.terraria]
    
    inline def tf2: typings.gamedig.gamedigStrings.tf2 = "tf2".asInstanceOf[typings.gamedig.gamedigStrings.tf2]
    
    inline def tfc: typings.gamedig.gamedigStrings.tfc = "tfc".asInstanceOf[typings.gamedig.gamedigStrings.tfc]
    
    inline def thps3: typings.gamedig.gamedigStrings.thps3 = "thps3".asInstanceOf[typings.gamedig.gamedigStrings.thps3]
    
    inline def thps4: typings.gamedig.gamedigStrings.thps4 = "thps4".asInstanceOf[typings.gamedig.gamedigStrings.thps4]
    
    inline def thu2: typings.gamedig.gamedigStrings.thu2 = "thu2".asInstanceOf[typings.gamedig.gamedigStrings.thu2]
    
    inline def towerunite: typings.gamedig.gamedigStrings.towerunite = "towerunite".asInstanceOf[typings.gamedig.gamedigStrings.towerunite]
    
    inline def trackmania2: typings.gamedig.gamedigStrings.trackmania2 = "trackmania2".asInstanceOf[typings.gamedig.gamedigStrings.trackmania2]
    
    inline def trackmaniaforever: typings.gamedig.gamedigStrings.trackmaniaforever = "trackmaniaforever".asInstanceOf[typings.gamedig.gamedigStrings.trackmaniaforever]
    
    inline def tremulous: typings.gamedig.gamedigStrings.tremulous = "tremulous".asInstanceOf[typings.gamedig.gamedigStrings.tremulous]
    
    inline def tribes1: typings.gamedig.gamedigStrings.tribes1 = "tribes1".asInstanceOf[typings.gamedig.gamedigStrings.tribes1]
    
    inline def tribesvengeance: typings.gamedig.gamedigStrings.tribesvengeance = "tribesvengeance".asInstanceOf[typings.gamedig.gamedigStrings.tribesvengeance]
    
    inline def tron20: typings.gamedig.gamedigStrings.tron20 = "tron20".asInstanceOf[typings.gamedig.gamedigStrings.tron20]
    
    inline def tshock: typings.gamedig.gamedigStrings.tshock = "tshock".asInstanceOf[typings.gamedig.gamedigStrings.tshock]
    
    inline def turok2: typings.gamedig.gamedigStrings.turok2 = "turok2".asInstanceOf[typings.gamedig.gamedigStrings.turok2]
    
    inline def universalcombat: typings.gamedig.gamedigStrings.universalcombat = "universalcombat".asInstanceOf[typings.gamedig.gamedigStrings.universalcombat]
    
    inline def unreal: typings.gamedig.gamedigStrings.unreal = "unreal".asInstanceOf[typings.gamedig.gamedigStrings.unreal]
    
    inline def unturned: typings.gamedig.gamedigStrings.unturned = "unturned".asInstanceOf[typings.gamedig.gamedigStrings.unturned]
    
    inline def urbanterror: typings.gamedig.gamedigStrings.urbanterror = "urbanterror".asInstanceOf[typings.gamedig.gamedigStrings.urbanterror]
    
    inline def ut: typings.gamedig.gamedigStrings.ut = "ut".asInstanceOf[typings.gamedig.gamedigStrings.ut]
    
    inline def ut2003: typings.gamedig.gamedigStrings.ut2003 = "ut2003".asInstanceOf[typings.gamedig.gamedigStrings.ut2003]
    
    inline def ut2004: typings.gamedig.gamedigStrings.ut2004 = "ut2004".asInstanceOf[typings.gamedig.gamedigStrings.ut2004]
    
    inline def ut3: typings.gamedig.gamedigStrings.ut3 = "ut3".asInstanceOf[typings.gamedig.gamedigStrings.ut3]
    
    inline def v8supercar: typings.gamedig.gamedigStrings.v8supercar = "v8supercar".asInstanceOf[typings.gamedig.gamedigStrings.v8supercar]
    
    inline def vcmp: typings.gamedig.gamedigStrings.vcmp = "vcmp".asInstanceOf[typings.gamedig.gamedigStrings.vcmp]
    
    inline def ventrilo: typings.gamedig.gamedigStrings.ventrilo = "ventrilo".asInstanceOf[typings.gamedig.gamedigStrings.ventrilo]
    
    inline def vietcong: typings.gamedig.gamedigStrings.vietcong = "vietcong".asInstanceOf[typings.gamedig.gamedigStrings.vietcong]
    
    inline def vietcong2: typings.gamedig.gamedigStrings.vietcong2 = "vietcong2".asInstanceOf[typings.gamedig.gamedigStrings.vietcong2]
    
    inline def warsow: typings.gamedig.gamedigStrings.warsow = "warsow".asInstanceOf[typings.gamedig.gamedigStrings.warsow]
    
    inline def wheeloftime: typings.gamedig.gamedigStrings.wheeloftime = "wheeloftime".asInstanceOf[typings.gamedig.gamedigStrings.wheeloftime]
    
    inline def wolfenstein2009: typings.gamedig.gamedigStrings.wolfenstein2009 = "wolfenstein2009".asInstanceOf[typings.gamedig.gamedigStrings.wolfenstein2009]
    
    inline def wolfensteinet: typings.gamedig.gamedigStrings.wolfensteinet = "wolfensteinet".asInstanceOf[typings.gamedig.gamedigStrings.wolfensteinet]
    
    inline def xpandrally: typings.gamedig.gamedigStrings.xpandrally = "xpandrally".asInstanceOf[typings.gamedig.gamedigStrings.xpandrally]
    
    inline def zombiemaster: typings.gamedig.gamedigStrings.zombiemaster = "zombiemaster".asInstanceOf[typings.gamedig.gamedigStrings.zombiemaster]
    
    inline def zps: typings.gamedig.gamedigStrings.zps = "zps".asInstanceOf[typings.gamedig.gamedigStrings.zps]
  }
}

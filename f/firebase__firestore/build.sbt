organization := "org.scalablytyped"
name := "firebase__firestore"
version := "3.7.3-919aac"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-a168fd",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-fb46c5",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-27abe0",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-0fb04a",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-564526",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.1-84a0a3",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-0225fd",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-11b0b6",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-2a85ad",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-beed78",
  "org.scalablytyped" %%% "long" % "5.2.1-d0ec65",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-e8ddf7",
  "org.scalablytyped" %%% "rollup" % "3.3.0-1c8d6b",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "typescript" % "4.9.3-52822d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

organization := "org.scalablytyped"
name := "firebase__database-compat"
version := "0.2.10-faf725"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-a168fd",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-fb46c5",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-27abe0",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-0fb04a",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-564526",
  "org.scalablytyped" %%% "firebase__database" % "0.13.10-44c0b6",
  "org.scalablytyped" %%% "firebase__database-types" % "0.9.17-a1d566",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-0225fd",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-11b0b6",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
